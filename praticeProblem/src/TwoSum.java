import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int []arr = {1,3,4,5};
        int target = 7;
        int[][] newArr;
        newArr = new int[][]{twoSum(arr, target)};
        System.out.println(Arrays.deepToString(newArr));
    }
}
