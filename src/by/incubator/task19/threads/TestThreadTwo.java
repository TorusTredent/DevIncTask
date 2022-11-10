package by.incubator.task19.threads;

import static by.incubator.task19.console.Writer.print;

public class TestThreadTwo implements Runnable{

    @Override
    public void run() {
        print("Thread 2 start");
        print("Thread 2 finished");
    }
}
