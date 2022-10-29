package by.incubator.task15;

import by.incubator.task15.console.Writer;

public interface Converter <T, N> {

    N convert(T t);

    static <T> boolean isNotNull(T t) {
        return !(t == null);
    }

    default void writeToConsole(T t) {
        Writer.println(t);
    }
}
