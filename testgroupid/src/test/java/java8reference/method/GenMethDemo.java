package java8reference.method;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};

        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }


    }

}
