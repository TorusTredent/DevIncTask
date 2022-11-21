package by.incubator.task20;

import by.incubator.task17.entity.Test;

public class TestSingleton {

    private int a;
    private int b;
    private int c;
    private static volatile TestSingleton instance;

    private TestSingleton() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
    }

    public static TestSingleton instance() {
        TestSingleton testSingleton = instance;
        if (testSingleton == null) {
            synchronized (TestSingleton.class) {
                testSingleton = instance;
                if (testSingleton == null) {
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "TestSingleton{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} hashcode = " + hashCode();
    }
}
