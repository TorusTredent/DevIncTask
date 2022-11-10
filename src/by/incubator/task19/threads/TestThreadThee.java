package by.incubator.task19.threads;

import java.util.concurrent.Callable;

import static by.incubator.task19.console.Writer.print;

public class TestThreadThee implements Callable {

    @Override
    public Object call() throws Exception {
        print("Thread 3 start");
        print("Thread 3 finished");
        return null;
    }
}
