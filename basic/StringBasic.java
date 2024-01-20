public class StringBasic {
    public static void main(String[] args) {
//        String var = "Hello World \u00BB";
//        String var1 = "10";
//        String var2 = "20";
//        System.out.println(var1+var2); //op:1020
        //proper way to decleare a string is
        String v1 = new String("Hello World");
        System.out.println(v1);
    }
}


/*
* NOTES-->
* Strings: are the sequence of charater.and it is a Class
* var1+var2 = 1020 because it is concating.
* eg:
    String var1 = "10";
    String var2 = "20";
    System.out.println(var1+var2); //op:1020
*
* Type cating: intercoversion of data forms.
* eg:
    int var1 = 10;
    String var2 = "20";
    System.out.println(var1+var2); op: 1020
* */