package java8reference.constructorex;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons genCons = new GenCons(100);
        GenCons genCons1 = new GenCons(123.5F);

        genCons.showValue();
        genCons1.showValue();
    }
}
