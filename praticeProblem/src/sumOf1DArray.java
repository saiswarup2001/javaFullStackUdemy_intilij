import java.util.Arrays;

public class sumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int len = nums.length;
        int sum = 0;
        //int temp = nums[0];
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
    }
}