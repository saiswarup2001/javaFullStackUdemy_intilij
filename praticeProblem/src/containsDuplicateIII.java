public class containsDuplicateIII {
    public static void main(String[] args) {
        int []nums = {1,0,1,1};
        int indexDiff = 1;
        int valueDiff = 2;

        for(int i=0; i< nums.length; i++){
            for(int j= i+1; j< nums.length; j++){
                if(Math.abs((long) nums[i] - nums[j]) <= valueDiff && j-i <= indexDiff)
                    System.out.println(true);
            }
        }
        System.out.println(false);
//        if(k == valueDiff){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

    }
}
