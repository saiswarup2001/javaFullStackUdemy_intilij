package oops.inheritance;


class D{
    static int i;
}
class C extends D{
    static int j;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
    }
}

