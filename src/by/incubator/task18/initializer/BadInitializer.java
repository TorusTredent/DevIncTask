package by.incubator.task18.initializer;

import by.incubator.task18.console.Writer;

import java.lang.reflect.Field;

public class BadInitializer<T> extends Initializer<T>{

    public static <T> T initialize(T target, String fieldName, Object value) {
        Class<?> clazz = target.getClass();
        Field field = findFieldByName(clazz, fieldName);

        field.setAccessible(true);
        try {
            field.set(target, value);
        } catch (IllegalAccessException e) {
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
}
