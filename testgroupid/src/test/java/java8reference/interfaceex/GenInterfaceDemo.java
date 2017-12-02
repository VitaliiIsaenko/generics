package java8reference.interfaceex;

public class GenInterfaceDemo {

    public static void main(String[] args) {
        Integer[] inums = {3,6,2,8,6};
        Character[] csh = {'b', 'r', 'p', 'w'};

        MinMaxImplementor<Integer> iob = new MinMaxImplementor<>(inums);
        MinMaxImplementor<Character> cob = new MinMaxImplementor<>(csh);

        System.out.println(iob.min());

        System.out.println(cob.max());
    }
}
