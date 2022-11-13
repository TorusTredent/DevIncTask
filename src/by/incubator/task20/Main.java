package by.incubator.task20;

import static by.incubator.task20.Writer.print;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(getRunnable());
        Thread thread2 = new Thread(getRunnable());
        Thread thread3 = new Thread(getRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
    }


    private static Runnable getRunnable() {
        return () -> print(TestSingleton.instance());
    }
}
