package java8reference.interfaceex;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
