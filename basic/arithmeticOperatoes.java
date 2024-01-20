import com.sun.security.jgss.GSSUtil;

public class arithmeticOperatoes {
    public static void main(String[] args) {

        int add = 1+2; //So plus operator could be used to add two entities.And plus is also used to concatenate two entities.
        //String s = "Hello" + "World";
        System.out.println(add);
        //System.out.println(s);
        int x = 2;
        int sub = 12 - x;
        int mul = 12*2;
        int div = 12/2;
        int mod = 12%2;  //it give us the reminder
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // increment operator
        int i = 10;
        System.out.println(i++); //10
        System.out.println(i); //11
        int y = 1;
        System.out.println(++y); //2
        System.out.println(y); //2
        System.out.println(" \n");
        //decrement operator
        int a = 2;
        System.out.println(a--); //2
        System.out.println(a); //1
        int b = 2;
        System.out.println(--b); //1
        System.out.println(b); //1

    }
}

/* NOTES-->
   Operators are entities which will help us to perform some operations.
*  And operators are -- so important for calculating or computing things.
* So Operator has a huge impact on each and every program which we build
  in other programming languages.
*
* postfix and infix:
* eg: x++[its and example of postfix]:
* This will increase the value of X by one,and then we would be printing
  this on our console after the completion of the program.
  *     int i = 10;
        System.out.println(i++);
        System.out.println(i);
* ++x[prefix example]:first the value is incremented and then it print on the consol*/