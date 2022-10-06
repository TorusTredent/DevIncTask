package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

public interface Starveble {

    default void isHungry() {
        Writer.print("Not hungry");
    }
}
