package by.incubator.task14;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    private static final String[] PRODUCTS = {"Milk", "Bread", "Salad", "Broccoli", "Pears", "Pineapples", "Butter"};
    private static final int MAX_QUANTITY = 70;
    private static final int MIN_QUANTITY = 30;

    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = insertIntoMyHashMap();
        Writer.print("The most frequent product: " + mostFrequent(myHashMap));

        MyHashSet<String> myHashSet = getProductSet();
        Writer.print("The list of product: ");
        Writer.printSet(myHashSet);
    }

    private static MyHashMap<String, Integer> insertIntoMyHashMap() {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        for (String product : PRODUCTS) {
            myHashMap.put(product, generateRandomQuantity());
        }
        return myHashMap;
    }

    private static int generateRandomQuantity() {
        return (int) (Math.random() * (MAX_QUANTITY - MIN_QUANTITY + 1) + MIN_QUANTITY);
    }

    private static String mostFrequent(MyHashMap<String, Integer> myHashMap) {
        int max = 0;
        String mostFrequentProduct = "";
        for (String product : PRODUCTS) {
            int quantity = myHashMap.get(product);
            if (max < quantity) {
                max = quantity;
                mostFrequentProduct = product;
            }
        }
        return mostFrequentProduct;
    }

    private static MyHashSet<String> getProductSet() {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        for (String product : PRODUCTS) {
            myHashSet.add(product);
        }
        myHashSet.add("Sweets");
        myHashSet.add("Chocolate");
        myHashSet.add("Cookies");
        myHashSet.add("Marmalade");
        return myHashSet;
    }
}
