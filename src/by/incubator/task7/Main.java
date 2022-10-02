package by.incubator.task7;

import sun.java2d.pipe.AAShapePipe;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[999999999];
        test(1);
    }

    private static void test(int i) {
        test(i);
        System.out.println(i);
    }
}
