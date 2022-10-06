package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

public class Horse extends Animal{

    public Horse(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    @Override
    public void move() {
        Writer.print("Top-top");
    }

    @Override
    public void isHungry() {
        Writer.print("I want hay");
    }

    @Override
    public void voice() {
        Writer.print("I-go-go");
    }
}
