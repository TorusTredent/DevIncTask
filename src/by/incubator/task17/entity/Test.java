package by.incubator.task17.entity;

import static by.incubator.task17.console.Writer.print;

public class Test implements TestInterface{

    private String testString;

    @Deprecated
    private int testInt;

    public Test() {
    }

    public Test(String testString, int testInt) {
        this.testString = testString;
        this.testInt = testInt;
    }

    private void sayHello() {
        print("Hello");
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    @Override
    public void testA() {

    }

    @Override
    public int testB(int a) {
        return 0;
    }

    @Override
    public String testC(String a, int b, long v) {
        return null;
    }
}
