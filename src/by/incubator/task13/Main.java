package by.incubator.task13;

import by.incubator.task13.collection.MyArrayList;
import by.incubator.task13.collection.MyLinkedList;
import by.incubator.task13.console.Writer;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        JosephProblem josephProblem = new JosephProblem();
        Writer.print(josephProblem.getLastSurvivorNumber(myArrayList));
        Writer.print(josephProblem.getLastSurvivorNumber(myLinkedList));
    }
}
