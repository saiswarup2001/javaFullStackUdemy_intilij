package Constructor.constructorOverloading;

import java.sql.SQLOutput;

class Details{
    int sid;
    String name;
    int age;

    Details(){}
    Details(int sid){
        this.sid = sid;
    }

    Details(int sid, String name){
        this.sid = sid;
        this.name = name;
    }

    Details(int sid, int age, String name){
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    //int count = 0;
    void Display(){

        System.out.println("Details Of the Students:");
        System.out.println("Student ID: "+ sid +"\n"+ "Student Name: "+ name +
                "\n"+ "Student Age: "+ age );

        System.out.println();
        //count = count + 1;
    }
}
public class Student {
    public static void main(String[] args) {
        Details sd = new Details();
        Details sd1 = new Details(10);
        Details sd2 =new Details(11, "Ram");
        Details sd3 =new Details(12, 22, "Shyam");

        sd.Display();
        sd1.Display();
        sd2.Display();
        sd3.Display();
    }
}
