package by.incubator.task1;

public class Main {
    private final static Writer writer = new Writer();

    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        printClassLoaderAndParents(mainClass);

        Class<Integer> integerClass = Integer.class;
        printClassLoader(integerClass);

        Class<TestClass> testClassClass = TestClass.class;
        printClassLoaderAndParents(testClassClass);
    }

    private static void printClassLoaderAndParents(Class obj) {
        writer.print("ClassLoader and parents: ");
        writer.printClassLoader(obj);
        writer.printClassParents(obj);
        writer.print("________________________________");
    }

    private static void printClassLoader(Class obj) {
        writer.print("ClassLoader: ");
        writer.printClassLoader(obj);
        writer.print("________________________________");
    }
}