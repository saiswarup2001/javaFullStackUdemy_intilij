package methodsQuestion;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        details("Sai",201910057);
        String Grade = marksObtained(92);
        System.out.println(Grade);
    }

    public static void details(String name, int roll){
        System.out.println("Name : "+name);
        System.out.println("Roll no is : "+roll);
    }

    public static String marksObtained(double marks){
        if(marks >= 10 && marks <= 20 ){
            return ("Grade is : E");
        }else if(marks >= 30 && marks <= 40 ){
            return ("Grade is : D");
        }else if(marks >= 41 && marks <= 50 ){
            return ("Grade is : C");
        }else if(marks >= 60 && marks <= 70 ){
            return ("Grade is : B");
        }else if(marks >= 71 && marks <= 80  ){
            return ("Grade is : A");
        }else if(marks >= 80 && marks <= 90 ){
            return ("Grade is : O");
        }else if(marks >= 90 && marks <= 100 ){
            return ("Grade is : O+");
        }else{
            return "Fail";
        }
    }
}
