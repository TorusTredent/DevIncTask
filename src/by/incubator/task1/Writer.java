package by.incubator.task1;

public class Writer {

    public<T> void print(T str) {
        System.out.println(str);
    }

    public void printClassLoader(Class obj) {
        print("Class: " + obj + ", classLoader: " + obj.getClassLoader());
    }

    public void printClassParents(Class obj) {
        print("Class: " + obj + ", classLoader: " + obj.getClassLoader()
                                    + ", " + "parent 1: " + obj.getClassLoader().getParent()
                                    + ", " + "parent of parent 1: " + obj.getClassLoader().getParent().getParent());
    }
}
