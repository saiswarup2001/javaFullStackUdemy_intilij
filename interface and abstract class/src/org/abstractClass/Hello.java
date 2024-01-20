package org.abstractClass;

public class Hello {
    public static void main(String[] args) {
        Person jhon = new vegan();
        jhon.speak();
        jhon.eat();
        jhon.breath();
        jhon.message();

        System.out.println("================");
        Person mia = new nonVegan();
        mia.speak();
        mia.eat();
    }
}
