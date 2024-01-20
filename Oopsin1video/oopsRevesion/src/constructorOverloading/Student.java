package constructorOverloading;

class Student {
    //data: data members: instance Variable
    int studentId;
    String studentName;
    String studentCity;

    //Non- parameterized constructor
    Student(){
        System.out.println("Creating constructor ...");
    }

    //constructor-overloading: Same constructor name with diff args.
    Student(int studentId){
        this.studentId = studentId;
        System.out.println("Parameterized const...");
    }

    //parameterized constructor
    public Student(int id, String name, String city){
        studentId = id;
        studentName = name;
        studentCity = city;
    }

    //Behaviour : member methods: methods: (function)
    public void study(){
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("My name is "+ studentName);
        System.out.println("Id "+ studentId);
        System.out.println("city "+ studentCity);
    }
}
