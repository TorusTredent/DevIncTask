package by.incubator.task14;

import java.util.Set;

public class Writer {

    public static <T> void print (T text) {
        System.out.println(text);
    }
    
    public static <T> void printSet(Set<T> set) {
        for (T t : set) {
            print(t);
        }
    } 
}
