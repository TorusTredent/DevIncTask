package by.incubator.task9.entity;

public class Animal implements Movable, Starveble, Voiceable{

    private String name;
    private int footNumber;
    private boolean hasMustache;

    public Animal() {
    }

    public Animal(String name, int footNumber, boolean hasMustache) {
        this.name = name;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    @Override
    public void move() {
        Movable.super.move();
    }

    @Override
    public void isHungry() {
        Starveble.super.isHungry();
    }

    @Override
    public void voice() {
        Voiceable.super.voice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
