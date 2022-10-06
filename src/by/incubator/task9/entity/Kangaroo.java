package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

import java.nio.file.Watchable;
import java.sql.Wrapper;

public class Kangaroo extends Animal{

    public Kangaroo(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    @Override
    public void move() {
        Writer.print("Jump-jump");
    }

    @Override
    public void isHungry() {
        Writer.print("I want berries");
    }

    @Override
    public void voice() {
        Writer.print("Khe-khe");
    }
}
