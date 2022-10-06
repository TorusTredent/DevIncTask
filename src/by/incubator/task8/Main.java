package by.incubator.task8;

public class Main {

    public static void main(String[] args) {
//        int[] arr = new int[99999];
        test(1);
    }

    private static void test(int i) {
        test(i);
        System.out.println(i);
    }
}
