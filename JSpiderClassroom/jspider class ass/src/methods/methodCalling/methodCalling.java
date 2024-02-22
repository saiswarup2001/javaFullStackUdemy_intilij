package methods.methodCalling;

public class methodCalling {
    public static void main(String[] args) {
        int res = add(40,50);
        System.out.println("RESULT: "+ res);
    }

    public static int add(int a, int b){
        return a+b;
    }
}

/*
NOTE:
Return is a keyword.

Return Statement:
....................
Control transfer statement, It means it stops the execution of the current method and return the control to the caller back
eg:
caller = main
return stmt = public static int add (int a , int b){
                    return a+b;
                }
    --> once the return stmt execution cmplt then the control return back to main method
    public static void main(String[] args)
    {
        int res = add(10,20);
        System.out.println("Res: "+ res);
    }
 */