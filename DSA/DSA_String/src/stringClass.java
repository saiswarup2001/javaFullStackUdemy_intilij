import java.util.Scanner;

public class stringClass {
    public static void main(String[] args) {
        /*
         String :- A bunch of character's and it is a class
         Example: Sai
         to declare this:
            String name = "Sai";
        */
        // suppose we have created obj of String
        String name = new String("Sai");
        System.out.println("Hello "+ name);
        System.out.println("UpperCase: "+name.toUpperCase());
        System.out.println("lowerCase: "+name.toLowerCase());
        System.out.println("Concate: "+name.concat(" Swarup"));
        System.out.println("CharAt 2nd Postion: "+name.charAt(2));

        System.out.println("================================================================");
        //===========================================================================
        String x = "Study";
        String y = "Easy";

        String z = x.concat(y); //concatenate two String
        System.out.println(z);

        z = z.replace("Easy", "Hard");
        System.out.println(z);

        if(z.equals("StudyEasy")){
            System.out.println("The string is StudyEasy...");
        }else{
            System.out.println("The string is not StudyEasy...");
        }


        System.out.println("=========================");
    }
}
