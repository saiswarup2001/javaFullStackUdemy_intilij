public class switchCase {
    public static void main(String[] args) {
        int x = 20;

        char y = 'b';
//integer case
        switch (x){
            case 1: System.out.println("The value is equal to 1");
                    break;
            case 2: System.out.println("The value is equal to 2");
                    break;
            case 3: System.out.println("The value is equal to 3");
                    break;
            case 4: System.out.println("The value is equal to 4");
                    break;
            default:
                System.out.println("the value is not there an the input of user is: "+x );
        }
//charater case
        switch (y) {
            case 'a':
            case 'A':
                System.out.println("The value is equal to a");
                break;
            case 'b':
            case 'B':
                System.out.println("The value is equal to b");
                break;
            case 'c':
            case 'C':
                System.out.println("The value is equal to c");
                break;
            case 'd':
            case 'D':
                System.out.println("The value is equal to d");
                break;
            default:
                System.out.println("the value is not there an the input of user is: " + y);
        }
// string case
        String name = "Author";
        switch (name.toLowerCase()) {
            case "Chand":
                System.out.println("Teacher");
                break;
            case "tom":
                System.out.println("Hate this guy");
                break;
            case "sai":
                System.out.println("boy");
                break;
            case "author":
                System.out.println("Sai");
                break;
            default:
                System.out.println("the value is not there an the input of user is: " + y);
        }
    }
}


/*rules:
* always apply breaks to each statement including the default case
* code block is optional.
* sequence is not required
* we cant use float entity but we can use 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
* the char statement is case sensitive
* */
