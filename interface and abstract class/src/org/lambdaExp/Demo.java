package org.lambdaExp;
@FunctionalInterface
interface A{
    void show(int i);
}
@FunctionalInterface
interface b{
    int add(int i, int j);
}
public class Demo {
    public static void main(String[] args) {
        A obj = i -> System.out.println("Hi LAMBDA there " + i);
        obj.show(5);

        b obj1 = (i, j) -> i+j;
        int res = obj1.add(5, 10);
        System.out.println(res);
    }
}

