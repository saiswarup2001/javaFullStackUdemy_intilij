package basics;

public class classes_objects {
    public static void main(String[] args) {
        person p = new person(); //objects creation
        //properties can be accessed through . operator
        p.age = 24;
        p.name = "Sai";

        person p1 = new person();
        p1.name = "Swarup";
        p1.age = 25;
        System.out.println(p.age+" "+p.name);
        System.out.println(p1.age+" "+p1.name);
        //accessing through object
        p1.walk();
        p1.walk(12);
        p.eat();
    }
}

class person{
    String name;
    int age;

    //methods or Behaviour
    void walk(){
        System.out.println( name +" is walking.");
    }
    void walk(int steps){
        System.out.println( name +" is walking "+ steps+" steps");
    }
    void eat(){
        System.out.println( name +" is eating.");
    }
}
class A{
    void m1(){
        System.out.println("hi");
    }
}
class B extends A{
    void m1(){
        System.out.println("Hello");
    }
}
class xyz{
    public static void main(String[] args) {
        //A a = new A();
        //a.m1(); //output: hi

        A a = new B();
        a.m1(); //output: Hello


    }
}

/*NOTES:-
* polymorphism:
* The word “poly” means many and “morphs” means forms, So it means many forms.
* In Java polymorphism is mainly divided into two types:
* Compile-time Polymorphism
* Runtime Polymorphism: it is also known as method overriding .
*                       eg:
*                           class A{
                                void m1(){
                                    System.out.println("hi");
                                }
                            }
                            class B extends A{
                                void m1(){
                                    System.out.println("Hello");
                                }
                            }
                            class xyz{
                                public static void main(String[] args) {
                                    //A a = new A();
                                    //a.m1(); //output: hi

                                    A a = new B();
                                    a.m1(); //output: Hello


                                }
                            }
*
*
* Compile-time: It is also known as static polymorphism.
*               This type of polymorphism is achieved by function overloading or operator overloading.
* for example:
*    void walk(){
        System.out.println( name +" is walking.");
    }
    void walk(int steps){
        System.out.println( name +" is walking "+ steps+" steps");
    }
* Method Overloading:
*
* Runtime:*/