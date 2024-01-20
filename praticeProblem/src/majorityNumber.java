public class majorityNumber {
    public static void main(String[] args) {
        int nums[] ={3,2,3};
        int n = nums.length;

        int count = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(count >= n/2){
                System.out.println(nums[i]);
            }else{
                System.out.println("NO Ans");
            }
        }
    }
}
