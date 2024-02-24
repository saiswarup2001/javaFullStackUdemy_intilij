import java.util.ArrayList;

class MyGen<type>{
    type t ;
    String name;

    public MyGen(type t, String name) {
        this.t = t;
        this.name = name;
    }

    public type getT() {
        return t;
    }

    public void setT(type t) {
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Generic {
    public static void main(String[] args) {
        MyGen <Integer>myGen = new MyGen<>(12, "Sai Swarup Generics");
        Integer a = myGen.getT();
        System.out.println(a + myGen.getName());
    }
}
