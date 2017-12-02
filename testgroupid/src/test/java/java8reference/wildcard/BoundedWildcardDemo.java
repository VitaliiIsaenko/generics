package java8reference.wildcard;

public class BoundedWildcardDemo {
    static void showXY(Coords<?> c) {
        System.out.println("Coordinates X, Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coordinates X, Y, Z: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showXYZT(Coords<? extends FourD> c) {
        System.out.println("Coordinates X, Y, Z, T: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0,0),
                new TwoD(1,1),
                new TwoD(2,2)
        };

        Coords<TwoD> tdlocks = new Coords<>(td);
        showXY(tdlocks);
        //Doesn't work! Coords<TwoD> is not satisfied by condition Coords<? extends ThreeD>
        //showXYZ(tdlocks);

        FourD fd[] = {
                new FourD(0,0, 0, 0),
                new FourD(1,1, 1, 1),
                new FourD(2,2,2,2)
        };

        Coords<FourD> fdlocks = new Coords<>(fd);
        showXYZT(fdlocks);
        showXYZ(fdlocks);
        showXY(fdlocks);
    }
}
