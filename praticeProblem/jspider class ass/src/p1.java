public class p1 {
    public static void main(String[] args) {
        int pincode = 560004;
        System.out.println(pincode);
    }
}

class p2{
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age); //10
        age = age +1;
        System.out.println(age); //11
    }
}

class P3{
    public static void main(String[] args) {
        String fatherName = "Bipin Patnaik";
        String motherName = "Laxmi Patnaik";
        System.out.println("Father name: "+ fatherName
                + " Mother Name: "+ motherName);
    }
}

class Paytm{
    public static void main(String[] args) {
        int walletBalance = 0;
        int deposite1 = 500 , transfer = 150;
        int deposite2 = 200;

        //first deposit
        deposite1 = walletBalance + deposite1;
        System.out.println("Deposite amount :"+ deposite1);

        //second deposit
        deposite2 = walletBalance + deposite2;
        System.out.println("Second Depo: "+ deposite2);

        //current total balance
        walletBalance = deposite2 + deposite1;
        System.out.println("Total in wallet: "+walletBalance);

        //transfer amount
        walletBalance =  walletBalance - transfer;
        System.out.println("After Transfer: "+ walletBalance);
    }
}

//optimized way
class mamWallet{
    public static void main(String[] args) {
        int balance = 0;
        balance = balance+500;
        balance = balance+200;
        balance = balance-150;
        System.out.println(balance);
    }
}


//next question
/*
 *open balance = 2500
 * t1: withdraw 250
 * t2: deposit 300
 * t3: transfer 400
 * t4: deposit 200
 * t5: maintenance charge 180
 * t6: display account balance
 */

class store{
    public static void main(String[] args) {
        int balance = 2500;
        //t1: withdraw: 250
        balance = balance - 250;
        //t2: deposit: 300
        balance = balance + 300;
        //t3: transfer: 400
        balance = balance - 400;
        //t4: deposit: 200
        balance = balance + 200;
        //t5: maintenance charge: 180
        balance = balance - 180;
        //t6: display balance
        System.out.println("Remainng balance: "
                + balance);
    }
}

class friends{
    public static void main(String[] args) {
        String name = "Shyam Sundar Pradhan";
        System.out.println("Friend name: "+ name);
    }
}

class MyDetails{
    public static void main(String[] args) {
        String name = "Sai Swarup Patnaik";
        int age = 22;
        String edu = "B.Tech in ECE";
        String collegeName = "NIST Berhampur";
        int yearOfPass = 2023;
        String skills = "Core Java, HTML/CSS and JDBC";
        float cgpa = 8.73f;
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Education: "+ edu);
        System.out.println("College: "+ collegeName);
        System.out.println("Passing year: "+ yearOfPass);
        System.out.println("Skills: "+ skills);
        System.out.println("CGPA: "+ cgpa);
    }
}

//write a java prog to store two int value and perform
// addition

class Addition{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 35;
        int add = num1 + num2;
        System.out.println("Add of "+num1+" + "+num2+" = "+ add);
    }
}

class Store{
    public static void main(String[] args) {
        char a = 'Q';
        String b = "Hiiii";
        float c = 980.2f;
        int d = 20;
//        boolean e = false;
        String e = "False";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

class Calculator{
    public static void main(String[] args) {
        int a = 100;
        int b = 50;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Addition of "+a+" + "+b+" = "+ add);
        System.out.println("Subtraction of "+a+" - "+b+" = "+ sub);
        System.out.println("Multiplication of "+a+" * "+b+" = "+ mul);
        System.out.println("Division of "+a+" / "+b+" = "+ div);
    }
}