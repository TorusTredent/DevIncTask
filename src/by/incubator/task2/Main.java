package by.incubator.task2;


public class Main {
    public static void main(String[] args) throws Exception{
       print("Hello from jar!");
    }

    private static<T> void print(T text) {
        System.out.println(text);
    }
}