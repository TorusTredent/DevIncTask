package by.incubator.task15;

@FunctionalInterface
public interface Filter<T> {

    boolean apply(T o);
}
