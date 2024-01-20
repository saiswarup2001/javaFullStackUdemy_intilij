class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("MONIK");
            //we want that our system will wait for some period after printing the output
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j<100; j++){
            System.out.println("Sai");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class threadDemo {
    public static void main(String[] args) {
        //creating object of A and B
        A obj1 = new A();
        B obj2 = new B();

     /*   //priority of threads max->10 min->1 and normal->5
        System.out.println(obj1.getPriority()); //5
        obj2.setPriority(Thread.MAX_PRIORITY);
    */
        //start is a thread function which extends the Thread.class and have an inbuilt run method to do work parallel
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
