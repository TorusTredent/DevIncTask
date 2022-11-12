package by.incubator.task18.initializer;

import by.incubator.task18.validator.Validator;
import by.incubator.task18.console.Writer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Initializer<T> {

    public static <T> T initialize(T target, String fieldName, Object value) {
        Class<?> clazz = target.getClass();
        Field field  = findFieldByName(clazz, fieldName);

        String setterName = Validator.getSetterFieldName(field);
        Method methodSetter = findMethodeBySetterName(clazz, field, setterName);

        try {
            methodSetter.invoke(target, value);
        } catch (IllegalAccessException | InvocationTargetException e) {
            Writer.printError(e.getMessage());
        }
        return target;
    }


    private static Field findFieldByName(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(String.format("Field with name %s not found ", fieldName));
        }
    }

    private static Method findMethodeBySetterName(Class<?> clazz, Field field, String setterName) {
        try {
            return clazz.getMethod(setterName, field.getType());
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(String.format("Methode with name %s not found", setterName));
        }
    }
}
