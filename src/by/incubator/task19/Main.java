package by.incubator.task19;

import by.incubator.task19.threads.TestThreadOne;
import by.incubator.task19.threads.TestThreadThee;
import by.incubator.task19.threads.TestThreadTwo;

import static by.incubator.task19.console.Writer.print;

public class Main {

    private static TestThreadOne testThreadOne;
    private static TestThreadTwo testThreadTwo;
    private static TestThreadThee testThreadThee;
    private static Thread testThreadFour;

    public static void main(String[] args) throws Exception {
        initThreads();
        testThreadOne.setDaemon(true);
        startAllThreads();
    }


    private static void startAllThreads() throws Exception {
        testThreadOne.start();
        testThreadTwo.run();
        testThreadThee.call();
        testThreadFour.start();
        System.exit(0);
    }
    private static void initThreads() {
        testThreadOne = new TestThreadOne();
        testThreadTwo = new TestThreadTwo();
        testThreadThee = new TestThreadThee();
        testThreadFour = new Thread(new Runnable() {
            @Override
            public void run() {
                print("Thread 4 start");
                print("Thread 4 finished");
            }
        });
    }
}
