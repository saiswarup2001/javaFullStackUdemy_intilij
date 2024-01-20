package basics;
//it is also known as method overriding
class parentClass{ //parent class
    void method1(){
        System.out.println("Hi i am method 1 of parent class");
    }
}
class childClass extends parentClass{
    //@override
    void method1(){
        System.out.println("hello i am method 1 of child class");
    }
}
public class runTimePolymorphism{
    public static void main(String[] args) {
        parentClass pc = new childClass(); //creating object of parentClass and instantiate the childClass
        //here subclass override the value of parentClass.
        pc.method1(); //output: hello I am method 1 of child class
    }
}
