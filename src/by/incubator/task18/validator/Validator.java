package by.incubator.task18.validator;

import by.incubator.task18.console.Writer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Validator {

    public static boolean validateClass(Class<?> clazz) {
        try {
            return validateConstructor(clazz) && validateSetters(clazz) && validateGetters(clazz);
        } catch (IllegalArgumentException e) {
            Writer.printError(e.getMessage());
        }
        return false;
    }


    private static boolean validateGetters(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                Method method = clazz.getMethod(getGetterFieldName(field));
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class must have getters");
            }
        }
        return true;
    }

    private static boolean validateSetters(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                Method method = clazz.getMethod(getSetterFieldName(field), field.getType());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class must have setters");
            }
        }
        return true;
    }

    private static boolean validateConstructor(Class<?> clazz) {
        try {
            Constructor<?> constructor = clazz.getConstructor();
            int countOfParameters = constructor.getParameterCount();
            if (countOfParameters > 0) {
                throw new IllegalArgumentException("Class must have default constructor");
            }
            return true;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class must have default constructor");
        }
    }

    public static String getSetterFieldName(Field field) {
        return "set" + String.valueOf(field.getName().charAt(0)).toUpperCase() + field.getName().substring(1);
    }


    public static String getGetterFieldName(Field field) {
        return "get" + String.valueOf(field.getName().charAt(0)).toUpperCase() + field.getName().substring(1);
    }
}
