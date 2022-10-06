package by.incubator.task9.console;

import by.incubator.task9.entity.Animal;
import by.incubator.task9.entity.Dragonfly;
import by.incubator.task9.entity.Horse;
import by.incubator.task9.entity.Kangaroo;

import java.security.acl.AclNotFoundException;

public class Writer {

    public static<T> void print(T text) {
        System.out.println(text);
    }

    public static void printAnimalVoice(Animal[] animals, Horse horse,
                                        Kangaroo kangaroo, Dragonfly dragonfly) {
        for (Animal animal : animals) {
            animal.voice();
        }
        horse.voice();
        kangaroo.voice();
        dragonfly.voice();
    }

    public static void printAnimalIsHungry(Animal[] animals, Horse horse,
                                        Kangaroo kangaroo, Dragonfly dragonfly) {
        for (Animal animal : animals) {
            animal.isHungry();
        }
        horse.isHungry();
        kangaroo.isHungry();
        dragonfly.isHungry();
    }

    public static void printAnimalMove(Animal[] animals, Horse horse,
                                        Kangaroo kangaroo, Dragonfly dragonfly) {
        for (Animal animal : animals) {
            animal.move();
        }
        horse.move();
        kangaroo.move();
        dragonfly.move();
    }
}
