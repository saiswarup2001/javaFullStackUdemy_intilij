package oops.inheritance.multilevelinheritance;

class Animal{
    int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    void showWeight(){
        System.out.println("Weight is: "+ weight +"Kg");
    }
}

class Person extends Animal{

    String pName;

    public Person(int weight, String pName) {
        super(weight);
        this.pName = pName;
    }


    void showName() {
        super.showWeight();
        System.out.println("Name is: "+ pName);
    }
}

class Student extends Person{
    int sid;

    public Student(int weight, String pName, int sid) {
        super(weight, pName);
        this.sid = sid;
    }

    void ShowStudentDetails(){
        super.showName();
        System.out.println("Student id: "+ sid);
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Student s = new Student(50,"Sai Swarup", 2001);
        System.out.println(s.pName);
        System.out.println();
        s.ShowStudentDetails();
    }
}
