package HowToTakeUserInput;

import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

    }
}












//        try{
//            int num = System.in.read();
//            System.out.println(num - 48); // it returns the ascii values a->97, A->65, 3->51
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//println belongs to PrintStream.class -> System.class