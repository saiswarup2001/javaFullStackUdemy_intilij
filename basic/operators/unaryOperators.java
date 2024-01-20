package operators;

public class unaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        //1. Not operator ( ! )
        System.out.print("Not Operator: ");
        if(!(a>b)){
            b = a;
            System.out.println(b);
        }else{
            System.out.println("Zero");
        }

        //2. minus (-)
        System.out.print("minus Operator: ");
        b = -(a);
        System.out.println(b);

        //3. Bitwise Complement ( ~ )
        /*  a = 5 [0101 in Binary]
            result = ~5
            This performs a bitwise complement of 5
            ~0101 = 1010 = 10 (in decimal)
            Then the compiler will give 2’s complement
            of that number.
            2’s complement of 10 will be -6.
            result = -6
          */
        System.out.print("Bitwise Complement: ");
        int bitwise = ~(a);
        System.out.println(bitwise);

        //4. Increment (++)
        System.out.print("Increment");
        System.out.println("a: "+ a);
        b = a++;
        System.out.println("b after a++: "+ b);
        System.out.println("a after a++ "+ a);
        b = ++a;
        System.out.println("b after ++a: "+ b);

        //4. Decrement (--)
        System.out.print("Decrement");
        System.out.println("a: "+ a);
        b = a--;
        System.out.println("b after a--: "+ b);
        System.out.println("a after a--: "+ a);
        b = --a;
        System.out.println("b after --a: "+ b);
    }
}
