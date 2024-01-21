package thisKeyword;

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo d1 = new Demo(6);
        Demo d2 = new Demo(1,"Sai",
                "BAM");
        d.show();
        d1.show();
        d2.show();
    }
}

/*
this keyword
--> this keyword refers to current invoking object.

this()
--> for calling current class constructor from inside
different constructor of same class
 */