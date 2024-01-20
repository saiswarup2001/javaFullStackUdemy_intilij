package multipleCatchBlock;

public class finallyBlock {
    public static void main(String[] args) {
        int j = 10;
        int k = 0;
        try{
            int z = j/k;
        }catch(Exception E){
            E.printStackTrace();
            System.out.println("Error in try block: "+ E);
        }finally{
            System.out.println("system process completed...");
        }
    }
}

//finally block always get executed ...