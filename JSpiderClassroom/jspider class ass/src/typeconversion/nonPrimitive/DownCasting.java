package typeconversion.nonPrimitive;

class C{
    int age;
}

class D extends C{
    String name;
}
public class DownCasting {
    public static void main(String[] args) {
        C c = new D();
        //c.age = 13;
//        c.name="sai"; //CTE
        D d = (D)c; //Down casting
        d.name = "Sai";
        d.age = 10;
        System.out.println("Age: "+ d.age);
        System.out.println("Name: "+ d.name);
    }
}

//NOTE:
// In down casting we mandatory do the modification and casting by our self only.
// we can access parent class object through down casting(advantage)