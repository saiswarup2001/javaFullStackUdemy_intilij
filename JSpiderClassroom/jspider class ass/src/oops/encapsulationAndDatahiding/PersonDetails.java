package oops.encapsulationAndDatahiding;


class person{
    private String name;
    private int age;

    //Setters
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    //Getters
    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

}
public class PersonDetails {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Sai Swarup");
        p.setAge(22);
        int age = p.getAge();
        String name = p.getName();
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
