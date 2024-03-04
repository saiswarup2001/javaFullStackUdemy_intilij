package objectClass;

import java.util.Objects;

class Cir{
    int rad;

    public Cir(int rad) {
        this.rad = rad;
    }

    @Override
    public boolean equals(Object o) {
        Cir cir = (Cir) o; //down casting
        return rad == cir.rad;
    }

}
public class EqualObject {
    public static void main(String[] args) {
        Cir c1 = new Cir(10);
        System.out.println(c1.hashCode());
        Cir c2 = new Cir(10);
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
