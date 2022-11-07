package by.incubator.task18.initializer;

import by.incubator.task18.validator.Validator;
import by.incubator.task18.console.Writer;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory<T> {

    static <T> T create(Class<T> clazz) {
        if (Validator.validateClass(clazz)) {
            try {
                return (T) clazz.getConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                Writer.printError(e.getMessage());
            }
        }
        throw new IllegalArgumentException("Class don't have default constructor/setters/getters");
    }
}
