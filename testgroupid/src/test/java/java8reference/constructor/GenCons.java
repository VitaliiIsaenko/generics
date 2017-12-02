package java8reference.constructor;

public class GenCons {
    private double value;

    <T extends Number> GenCons(T arg) {
        value = arg.doubleValue();
    }

    void showValue(){
        System.out.println(value);
    }
}
