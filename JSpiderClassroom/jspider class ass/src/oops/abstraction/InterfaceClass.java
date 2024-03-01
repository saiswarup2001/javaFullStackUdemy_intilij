package oops.abstraction;

interface AnimalEat{
    //abstract method
    void eat();
}

interface AnimalTravel{
    void travel();
}

class Animal implements AnimalEat, AnimalTravel{

    @Override
    public void eat() {
        System.out.println("Animal is Eating...");
    }

    @Override
    public void travel() {
        System.out.println("Animal is Traveling...");
    }
}
public class InterfaceClass{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}


/*
We can achieve multiple inheritance using interface
* */