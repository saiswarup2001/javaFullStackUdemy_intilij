package constructorOverloading;

public class Demo {
    public static void main(String[] args) {
        //now creating obj
        Student st1 = new Student();
        st1.studentCity = "Bam";
        st1.studentName = "Sai";
        st1.studentId = 1;
        st1.study();
        st1.showFullDetails();

        Student st2 = new Student(12);
        //st2.studentId=2;
        st2.studentName = "Ram";
        st2.studentCity = "BBSR";
        st2.showFullDetails();

        Student st3 = new Student(122, "Ram Charan", "Berhampur");
        st3.showFullDetails();
    }
}

/*
--> Constructor: It is special case of method where we can initialized the obj data of the class.
--> There are 3 types of Constructor:
    1) Default : which is created during the time of object creation.
    2) Parameterized: Constructor with some arguments.
    3) Non - Parameterized: Constructor with no arguments.

--> Rules of Constructor:
    -> Name of constructor must be same as class name
    -> It doesn't have any return type

--> Constructor Overloading:
    -> It means constructor having same name but different arguments.
*/