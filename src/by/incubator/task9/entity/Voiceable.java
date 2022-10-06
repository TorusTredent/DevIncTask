package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

import java.sql.Wrapper;

public interface Voiceable {

    default void voice() {
        Writer.print("Voice");
    }
}
