package oops.PracticeQuestions;

class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Person{
    private int ID;
    private double salary;
    public Teacher(int age, String name, int ID, double salary) {
        super(age, name);
        this.ID = ID;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+ getName()+", \nAge: "+ getAge()+", \nID: "+ ID +", \nSalary: "+ salary);
    }
}
public class MainRun {
    public static void main(String[] args) {
        Teacher t = new Teacher(10, "Hari Krishna", 19, 50000.00);
        t.display();
    }
}
