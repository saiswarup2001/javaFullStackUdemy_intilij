public class primitiveDataTypeBooleanandChar {
    public static void main(String[] args) {
        boolean var = false;
        System.out.println(var);
        char var1 = 'd';
        System.out.println(var1);
        //op:
        // false
        // d
        System.out.println("\n");
        char v1 = 'a';
        System.out.println(v1); //op: a

        char v2 ='\u0061';
        System.out.println(v2); //op: a

        char v3 = 97;
        System.out.println(v3); //op: a
    }
}


/*
* NOTES:-->
* Unicodes: Unicode characters are universal character encoding standards.
* It represents the way different characters can be represented in different documents like text files, web pages, etc.
* The Unicode supports 4 bytes for the characters.
* UTF-8 has become standard character encoding it supports 4 bytes for each character.
* There are other different Unicode encodings like UTF-16 and UTF-8.
* Character literals in Java are constant characters in Java.
* They are expressed in single quotes ‘a’,’A, ‘1’,’!’, ‘π’, ‘$’,’©’.
* The data type that can store char literals is char.
*
* Different Methods to Store Unicode Characters
*   1.Assigning Unicode to the char data types.
*       ex: char v1 = 'a';
            System.out.println(v1);
*   2.Assigning Unicode values to char data types
*       ex: char c1 = '\u0061';
            System.out.println(c1); //op: a
*   3.Assigning ASCII values to char data types
*       ex: char c1 = 97;
            System.out.println(c1);
* ASCII Value range:-->[American Standard Code for Information Interchange]
*   1.The ASCII value of lowercase alphabets are from 97 to 122.
*   2.The ASCII value of uppercase alphabets are from 65 to 90.
* For more reference: https://www.javatpoint.com/java-ascii-table */