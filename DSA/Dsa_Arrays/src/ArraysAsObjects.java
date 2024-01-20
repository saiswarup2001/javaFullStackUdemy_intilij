class Student{
    String name;
    int marks;
    int rollNo;

}
public class ArraysAsObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sai";
        s1.marks = 88;
        s1.rollNo = 57;

        Student s2 = new Student();
        s2.name = "Sonu";
        s2.marks = 92;
        s2.rollNo = 45;

        Student s3 = new Student();
        s3.name = "Shyam";
        s3.marks = 92;
        s3.rollNo = 55;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student i: students) {
            System.out.println(i.name + " : "+ i.marks);
        }

    }
}
