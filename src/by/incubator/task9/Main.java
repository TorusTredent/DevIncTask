package by.incubator.task9;

import by.incubator.task9.console.Writer;
import by.incubator.task9.entity.Animal;
import by.incubator.task9.entity.Dragonfly;
import by.incubator.task9.entity.Horse;
import by.incubator.task9.entity.Kangaroo;
import sun.management.HotspotClassLoadingMBean;

import java.nio.file.Watchable;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = initAnimals();
        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);
        Writer.printAnimalVoice(animals, horse, kangaroo, dragonfly);
        Writer.printAnimalIsHungry(animals, horse, kangaroo, dragonfly);
        Writer.printAnimalMove(animals, horse, kangaroo, dragonfly);
    }

    private static Animal[] initAnimals() {
        Animal[] herd = new Animal[7];
        herd[0] = new Horse("Horse 1", 4, false);
        herd[1] = new Horse("Horse 2", 4, false);
        herd[2] = new Kangaroo("Kangaroo 1", 2, true);
        herd[3] = new Kangaroo("Kangaroo 2", 2, true);
        herd[4] = new Dragonfly("Dragonfly 1", 6, true);
        herd[5] = new Dragonfly("Dragonfly 2", 6, true);
        herd[6] = new Animal("Unknown type", 10, true);
        return herd;
    }
}
