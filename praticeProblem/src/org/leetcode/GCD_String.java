package org.leetcode;

public class GCD_String {
    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        if(!(str1+str2).equals(str2+str1)){
            System.out.println("");
        }
        int gcd = gcd(str1.length(), str2.length());
        System.out.println(str1.substring(0, gcd));
    }

    private static int gcd(int n1, int n2) {
        while (n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
}
