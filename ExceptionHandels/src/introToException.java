public class introToException {
    public static void main(String[] args) {
        introToException ie = new introToException();
        ie.case1(100, 10); //10
        ie.case1(10, 0); //the value of y is zero

        //case 2
        ie.case2(10, 0);
    }
    //suppose if we get a variable as zero, we can
    // handel it with manually as well as with
    // try-catch block

    //manual method
    public void case1(int x, int y){
        if(y != 0){
            System.out.println(x/y);
        }else{
            System.out.println("the value of y is zero");
        }
    }

    //using Try-Catch block
    public void case2(int x, int y){
        try{
            System.out.println(x/y);
        }catch(Exception e){
            System.out.println("error...."+ e);
        }
    }
}
