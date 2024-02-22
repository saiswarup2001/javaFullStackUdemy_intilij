package Constructor.taskParameterizedConstructor;

public class Employee {
    int eid;
    String eName;

    Employee(String eName, int eid){
        this.eid = eid;
        this.eName = eName;
    }

    void display(){
        System.out.println("Emp Id: "+ eid +" Emp Name is: "+ eName);
    }
}
