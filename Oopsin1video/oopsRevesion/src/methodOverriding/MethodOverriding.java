package methodOverriding;

class Animal{
    void walk(int st){
        System.out.println("Walking..."+ st + " Steps");
    }
    void eat(){
        System.out.println("Eating....");
    }
}

//sub-class
class Dog extends Animal{
    @Override
    void walk(int st) {
        System.out.println("walk "+ st +" steps");
    }

    @Override
    void eat() {
        super.eat();
    }
}
public class MethodOverriding {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.walk(16);
        d.eat();
    }
}
