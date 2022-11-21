package by.incubator.task19.threads;

import static by.incubator.task19.console.Writer.print;

public class TestThreadOne extends Thread{

    @Override
    public void run() {
        print("Thread 1 start");
        print("Thread 1 finished");
    }
}
