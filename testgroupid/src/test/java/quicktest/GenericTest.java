package quicktest;

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

        VeryGeneric<GenericA<?>> lastExampleVeryGeneric = new VeryGeneric<>();
        System.out.println(lastExampleVeryGeneric.getClass().getName());

        //I suppose it becomes generic without mentioning concrete type (in super class)
        //that later goes for Object (as was mentioned in Java 8 reference chapter 14 page 420 in russian version of book)
        NotGeneric ng = new NotGeneric();
        ng.getObj(5);

        //So we can use 'super' keyword to bound lower class for wildcard argument
        //so here we can use all classes that are super for integer (but sure, sub for Number because it is in restriction of GenericA class)
        VeryGeneric<GenericA<? super Integer>> veryGeneric = new VeryGeneric<>();
        System.out.println(lastExampleVeryGeneric.getClass().getName());

    }
}
