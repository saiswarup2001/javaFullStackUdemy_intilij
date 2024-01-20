public class jaggedArray3D {
    public static void main(String[] args) {

        int nums[][] = new int[3][]; // if inside array is not fixed (or)
        // we can say that column is not fixed is known as jagged array


        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        //to print this
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
        }

        //using for each loop
        System.out.println();
        System.out.println("=====================");
        for (int n[] : nums) { //n = parent array
            for (int m : n) {
                System.out.print(m + " "); // m = child array which print elements
            }
            System.out.println();
        }


        System.out.println("3D ARRAY");
        int num[][][] = new int[3][4][5];
    }
}

