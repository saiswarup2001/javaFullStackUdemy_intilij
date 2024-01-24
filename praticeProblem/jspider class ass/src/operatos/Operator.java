package operatos;

public class Operator {
    public static void main(String[] args) {
        System.out.println(10+10); // num num
        System.out.println(10+'a'); // num Char
        System.out.println(10+"hi"); // num+ String
        System.out.println("Hi" + "Hello"); // String String
        System.out.println('A'+" Apple"); //char string
        //System.out.println('a'+ true); //char boolean = error
        System.out.println("hi"+false); //string boolean
    }
}
