//217. Contains Duplicate
//Easy
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        boolean a = containsDuplicate(num);
        System.out.println(a);
    }
}
