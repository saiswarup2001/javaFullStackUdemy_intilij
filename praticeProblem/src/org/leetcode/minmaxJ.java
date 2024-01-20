package org.leetcode;

public class minmaxJ {
    public static void main(String[] args) {
        int num[] = {10, 11, 78, 66, 50};
        int max = num[0];
        int secondMax=max;
        for(int i=1; i<num.length; i++){
            if(num[i] > max){
                secondMax=max;
                max = num[i];
            }
            else if(num[i]>secondMax){
                secondMax = num[i];
            }


        }
        System.out.println("max is: "+max);
        System.out.println("second max: "+ secondMax);
    }
}
