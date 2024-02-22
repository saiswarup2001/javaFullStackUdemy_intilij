package Objects;

public class Book {
    public static void main(String[] args) {
        System.out.println("Main Starts..");
        System.out.println(new Book()); //creating object
        System.out.println(new Book());
        System.out.println("Main ends...");
    }
}


/*
Notes:
Object
-------
instance of the class.

syntax:
-------
1. using new keyword
    new Book();
2. Book() -> its a default constructor created by the java compiler during the time of obj creations.

Constructor:
-------------
-> It is a special case in java.
-> It has same name as of class name.
-> It is used to load variables and methods inside the object.


 */
