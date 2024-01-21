package thisKeyword;

public class Demo {
    int studentId;
    String studentName;
    String studentCity;

    Demo(){
        //this(9);
        this(1,"Ram","BBSR");
        System.out.println("no para const...");
    }

    Demo(int studentId, String studentName, String studentCity){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    Demo(int step) {
        System.out.println("number of step: " + step);
    }

    public void show(){
        System.out.println(this.studentCity + " "+ this.studentName+" "+this.studentId);
    }
}
