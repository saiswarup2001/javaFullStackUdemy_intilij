package operatos;

public class ternaryOperator {
    public static void main(String[] args) {
        //System.out.println((10>20)?10:20);

        int a = 10;
        int b = 20;
        System.out.println((a>b+1)?++a:++b);
    }
}

class EvenOdd{
    public static void main(String[] args) {
        int i = 10;
        System.out.println((i%2 == 0)?"Even" : "Odd");
    }
}

class Elections{
    public static void main(String[] args) {
        int per = 26;
        System.out.println((per >= 18)?"Yes eligible ":"Not eligible");

        System.out.println(10>20 && 30-10 > 40-20?"Yes":"No");
        int a = 10, b = 20;
        System.out.println(++a>++b||a++>b++?a:b);
    }
}

class Divisible{
    public static void main(String[] args) {
        int num = 15;
        System.out.println(((num%3==0) || (num%5==0))?"divisible":"not divisible");
    }
}

class B{
    public static void main(String[] args) {
        int a = 25;
        System.out.println(((a%5==0) && (a%2!=0) || (a%3!=0))?"only div by 5": "div by 5,2,3");
    }
}

class logicalNot {
    public static void main(String[] args) {
        //System.out.println(!10);//cte
        //System.out.println(!10==10);//cte
        System.out.println(!(10 == 10));//false
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
class A{
    public static void main(String[] args){
        int i = 56;
        boolean a = ((i%7==0) && (i%14==0) &&(i%3!=0));
        System.out.println((a == true)? "div by 14,7": "div by 3 only");
    }
}