package by.incubator.task13;

import by.incubator.task13.console.Reader;
import by.incubator.task13.console.Writer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JosephProblem {

    private List<Integer> josephList;
    private int warriorNumbers;
    private int killInterval;


    public Integer getLastSurvivorNumber(List<Integer> list) {
        this.josephList = list;
        setWarriorNumbers();
        setKillInterval();
        initializeList();
        removeWarriors();
        return josephList.get(0);
    }


    private void setWarriorNumbers() {
        Writer.print("Enter number of warriors: ");
        this.warriorNumbers = Reader.getWarriors();
    }

    private void setKillInterval() {
        Writer.print("Enter number of killer intervals: ");
        this.killInterval = Reader.getKillInterval();
    }

    private void initializeList() {
        IntStream.rangeClosed(1, warriorNumbers).forEach(i -> josephList.add(i));
    }

    private void removeWarriors() {
        int i = 0;
        int j = 0;
        while(warriorNumbers > 1) {
            j = (++j) % killInterval;
            if(j == 0) {
                warriorNumbers--;
                josephList.remove(i);
            } else {
                i = (++i) % warriorNumbers;
            }
        }
    }
}
