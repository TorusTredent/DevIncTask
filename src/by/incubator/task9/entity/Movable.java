package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

import java.nio.file.Watchable;

public interface Movable {

    default void move() {
        Writer.print("Movement");
    }
}
