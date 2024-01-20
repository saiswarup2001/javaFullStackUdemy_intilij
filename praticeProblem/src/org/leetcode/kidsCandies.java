package org.leetcode;

import java.util.Collections;
import java.util.List;
class Solution{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        for (int i : candies) {
            int sum = i + extraCandies;
            if(sum >= extraCandies){
                return Collections.singletonList(true);
            }
        }

        return Collections.singletonList(false);
    }
}
public class kidsCandies {
    public static void main(String[] args) {
        int candy[] = {2,3,5,1,3};
        int extraCandy = 3;
        Solution s = new Solution();
        s.kidsWithCandies(candy, extraCandy);
    }
}
