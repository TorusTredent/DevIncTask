package by.incubator.task9.entity;

import by.incubator.task9.console.Writer;

public class Dragonfly extends Animal{

    public Dragonfly(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    @Override
    public void move() {
        Writer.print("Flight");
    }

    @Override
    public void isHungry() {
        Writer.print("I want insects");
    }

    @Override
    public void voice() {
        Writer.print("Bj-w-w");
    }
}
