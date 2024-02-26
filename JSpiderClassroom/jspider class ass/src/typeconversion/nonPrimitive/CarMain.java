package typeconversion.nonPrimitive;

import java.util.Scanner;

//parent class
class Car{
    int version;
}

class Audi extends Car{
    String name;
}

class Luxury extends Car{
    String Color;
}

class BMW extends Car{
    String Brand;
}
public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Car Choice:");
        System.out.println("Enter 1 for Audi ");
        System.out.println("Enter 2 for Luxury");
        System.out.println("Enter 3 for BMW ");
        Car c = new Car();
        int choice = sc.nextInt();

        //switch case start
        switch(choice){
            case 1:
                Audi a =  (Audi)(c);
                a.version = 12;
                a.name = "Audi Q3";
                System.out.println("Welcome to Audi showroom");
                break;

            case 2:
                Luxury L = (Luxury)c;
                L.Color = "Red";
                L.version = 13;
                System.out.println("Welcome to Luxury Showroom");
                break;

            case 3:
                BMW B = (BMW)c;
                B.Brand = "BMW Gt";
                B.version = 12;
                System.out.println("Welcome to BMW Showroom");
                break;

            default:
                System.out.println("Invalid Input..Please Try Again");
                break;
        }
    }
}
