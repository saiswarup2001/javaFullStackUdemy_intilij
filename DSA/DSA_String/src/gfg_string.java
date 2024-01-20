import java.nio.charset.Charset;

public class gfg_string {
    public static void main(String[] args) {

        /*
        //Construct String with Byte array
        byte b_byte[] = {83, 97, 105}; //ASCII CODE: S:83, a:97, i:105
        String s_byte = new String(b_byte);
        System.out.println(s_byte); //Sai
         */

        /*
        //Construct String with Byte array,charset
        byte b_byte[] = {83, 97, 105}; //ASCII CODE: S:83, a:97, i:105
        Charset cs = Charset.defaultCharset();
        String s_byte = new String(b_byte, cs);
        System.out.println(cs); //version: UTF-8
        System.out.println(s_byte); //Sai
        */


        //Construct String with Byte array depending on index number
        byte b_byte[] = {83, 97, 105}; //ASCII CODE: S:83, a:97, i:105
        Charset cs = Charset.defaultCharset();
        String s_byte = new String(b_byte, 0,2);
        System.out.println(s_byte);
    }
}
