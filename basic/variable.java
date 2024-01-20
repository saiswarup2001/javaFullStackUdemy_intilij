public class variable {
    int a = 10; //Initilization or Instance variable.
    static int b = 10; // static variable.
    public static void main(String[] args) {


        /* understanding variable's */

        /*int v1 = 9/2;       //32byte of space
        float v2 = 10f/6f;   //its also used for decimals values like double -- 32byte of space
        double v3 = 10d/6d; // it is also an floating point value with double precision -- 64byte of space
        System.out.println("Value 1 is: "+ v1);
        System.out.println("Value 2 is: "+ v2);
        //Value 1 is: 1 (int op)
        //Value 2 is: 5.0 (float op)
        System.out.println("Value 3 is: "+ v3);*/

        /*int marks = 512;
        double percentage = marks*0.46f;
        System.out.println("Percentage is ="+ percentage);*/

        /* understanding static and instance variable*/

        System.out.println("value b is = "+ variable.b); // it can be called by 2 ways: 1. by className i.e. variable.b or directly by variable name i.e. b
        System.out.println("value b is = "+ b);
        variable v = new variable();
        System.out.println("value a is = "+ v.a);

        //output: value b is = 10
        //        value b is = 10
        //        value a is = 10
    }
}



// NOTES:-->

/*
  float takes 8bit after the decimal point
* whereas double takes 16bit after the decimal point
*
* variable = these are the containers where the values are stored
*
* For Numbers: int,short, long, double, byte, float
* For Chars: char
* For Booleans: boolean
* For String: string class
* in Java there is 8 datatypes-->int,short, long, double, byte, float, char, boolean and these are known as
* Primitive data types.
*
* 2 types of variable:
* 1. Static Variable: we can call them directly using class name i.e. variable.a
* 2. Instance Variable: we have to create object for our class and then call instance variable using object reference i.e. obj.a;
* System is a class which is provided by java and it is available in java.lang package
* Java.lang is a default package
*
* out --> is the static variable in system class
*
* println --> it is a method which ic available in PrintStream Class
* Constructor: if we don't have any constructor defination compiler will add it itself an default constructor
               to the program, and we can check this using cmd--> javap class_Name.class
				 ex:	variable v = new variable();
					    System.out.println("value a is = "+ v.a);

			   Here, variable() -->is the default constructor.
*/
