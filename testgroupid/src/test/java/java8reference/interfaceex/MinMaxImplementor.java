package java8reference.interfaceex;

public class MinMaxImplementor<T extends Comparable<T>> implements MinMax<T> {
    T[] values;

    MinMaxImplementor(T[] o) {
        values = o;
    }

    @Override
    public T min() {
        T v = values[0];
        for(int i = 1; i < values.length; i++){
            if (values[i].compareTo(v) < 0) {
                v = values[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = values[0];
        for(int i = 1; i < values.length; i++){
            if (values[i].compareTo(v) > 0) {
                v = values[i];
            }
        }
        return v;
    }
}
