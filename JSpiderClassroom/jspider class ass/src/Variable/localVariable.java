package Variable;

public class localVariable {
    public static void main(String[] args) {
        int b = 20;
        System.out.println(b);
    }
}

class ruleLocalVariable1{
    public static void main(String[] args) {
        /*
        int a;
        System.out.println(a);//CT Error
         */

        int a = 10;
        System.out.println(a);
    }
}

class ruleLocalVar2{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        {
            int b = 20;
            System.out.println(b);
        }
        //System.out.println(a);

    }
}

class p1{
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(a);
        }
//        System.out.println(a); //CT Error
    }
}

class p2{
    public static void main(String[] args) {
        int cls = 4;
        float per = 89.5f;
        char sec = 'b';
        System.out.println(cls);
        System.out.println(per);
        System.out.println(sec);
    }
}

class p3{
    public static void main(String[] args) {
        int ramu = 500; //current balance
        int tickets = 250; //ticket price
        int popcorn = 120; //popcorn price
        //after spending in all things
        int leftMoney = ramu - tickets - popcorn;
        System.out.println(leftMoney);
    }
}

class Box{
    public static void main(String[] args) {
        Box b = null;
        System.out.println(b);
    }
}

class Book{
    public static void main(String[] args) {
        Book b1 = null;
        Book b2 = null;
        System.out.println(b1+" "+b2);
    }
}