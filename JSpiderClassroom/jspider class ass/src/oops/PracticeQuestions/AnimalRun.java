package oops.PracticeQuestions;

class Animal{
    void Sound(){
        System.out.println("Parent class");
    }
    void legs(int count){
        System.out.println("In general animal has: "+ count +" legs.");
    }
}

class Dog extends Animal{
    void Sound(){
        System.out.println("Bhaww Bhaww..");
    }

    void legs(int count){
        System.out.println("Dog has: "+ count +" legs.");
    }
}

class Cat extends Animal{
    void Sound(){
        System.out.println("meaww meaww..");
    }

    void legs(int count){
        System.out.println("cat has: "+ count +" legs.");
    }
}
public class AnimalRun {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.legs(4);
        c.Sound();

        Animal b = new Dog();
        b.Sound();
        b.legs(4);
    }
}
