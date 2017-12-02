package classes;

import java.util.Enumeration;

public class GenericTest {
    public static void main(String[] args) {
        GenericA<Double> dGenericA = new GenericA<>();
        GenericA<Double> d2GenericA = new GenericA<>();
        //Possible to assign when type parameters are equal
        dGenericA = d2GenericA;

        GenericA<Integer> iGenericA = new GenericA<>();
        GenericA<Double> d3GenericA = new GenericA<>();
         //Possible to assign when right side var type parameter is a subclass of leftside var type parameter
        dGenericA = d2GenericA;

        GenericA<Number> genericA = new GenericA<Number>();
        //Possible to pass value to method of any applicable type (Number and its subclasses in the case)
        genericA.getObj(new Integer(5));
        System.out.println("GenericA<Number> genericA genericA.getObj(new Integer(5)).getClass().getName() " + genericA.getObj(new Integer(5)).getClass().getName());

        //Possible to do like this
        GenericA genA = new GenericA();
        System.out.println("genA.getClass().getName() " + genA.getClass().getName());
        System.out.println("GenericA genA genA.getObj(new Integer(5)).getClass().getName() " + genA.getObj(new Integer(5)).getClass().getName());

        VeryGeneric<Object>  vg = new VeryGeneric<>();
        VeryGeneric vgg = new VeryGeneric();
        System.out.println("VeryGeneric<Object> " + vg.getClass().getName() + " | VeryGeneric " + vgg.getClass().getName());

        GenericA<Integer> lastExampleA = new GenericA<>();
        VeryGeneric<GenericA<?>> lastExampleVeryGeneric = new VeryGeneric<>();
        System.out.println(lastExampleVeryGeneric.getClass().getName());

    }
}
