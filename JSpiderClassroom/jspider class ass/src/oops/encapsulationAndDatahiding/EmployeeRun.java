package oops.encapsulationAndDatahiding;


class Employee{
    private  int eid;
    private String ename;
    private int esal;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }
}
public class EmployeeRun {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEid(12);
        e.setEname("Sai");
        e.setEsal(1200);
        //get the data
        System.out.println("Employee Id: "+ e.getEid());
        System.out.println("Employee Name: "+ e.getEname());
        System.out.println("Employee Salary: "+ e.getEsal());
    }
}
