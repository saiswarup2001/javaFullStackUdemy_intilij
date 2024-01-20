package org.leetcode;

public class mpattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i=1;i<=5 ; i++){
            for (int j=1; j<=5; j++){
                if(j==1 || j==5 || i+j==6 && i<=3 || i==j && i<=3 ){
                    System.out.print("c");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
