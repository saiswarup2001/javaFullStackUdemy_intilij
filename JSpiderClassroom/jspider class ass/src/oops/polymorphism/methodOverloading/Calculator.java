package oops.polymorphism.methodOverloading;

class Calcu{
    int add(int a, int b){
       return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(int a, int b, double c){
        return a+b+c;
    }

    String add(String a, String b){
        return a+b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Calcu c = new Calcu();
        System.out.println("Int + Int : "+c.add(10,20));
        System.out.println("Int + Int + Int : "+c.add(10,20,30));
        System.out.println("Int + Int + Double : "+c.add(10, 20, 50.5));
        System.out.println("String + String : "+c.add("Sai", " Patnaik"));
    }
}
