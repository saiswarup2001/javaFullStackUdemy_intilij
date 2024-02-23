package oops.inheritance.hierarical;

public class Ball {
    int rad;

    public Ball(int rad) {
        this.rad = rad;
    }

    void Display(){
        System.out.print("Ball is of radius: ");
    }
}

class BasketBall extends Ball{

    public BasketBall(int rad) {
        super(rad);
    }

    @Override
    void Display() {
        super.Display();
        if(rad > 10 && rad < 17){
            System.out.println(rad +" and Its a Basket Ball");
        }else{
            System.out.println(rad +" and Its a normal Ball");
        }
    }
}

class FootBall extends Ball{

    public FootBall(int rad) {
        super(rad);
    }

    @Override
    void Display() {
        super.Display();
        if(rad > 18 & rad < 22){
            System.out.println(rad+" and it is a Football");
        }else{
            System.out.println(rad+ " its a BasketBall");
        }
    }
}

class TennisBall extends Ball{

    public TennisBall(int rad) {
        super(rad);
    }

    @Override
    void Display() {
        super.Display();
        if(rad > 5 & rad < 9){
            System.out.println(rad+" and it is a Tennis ball");
        }else if(rad > 9){
            System.out.println(rad+ " its a Basket ball");
        }else{
            System.out.println(rad+" its a FootBall");
        }
    }
}
class BallMain {
    public static void main(String[] args) {
        BasketBall b = new BasketBall(15);
        System.out.println("Radius: "+ b.rad);
        b.Display();

        FootBall f = new FootBall(21);
        System.out.println("Radius is: "+ f.rad);
        f.Display();

        TennisBall t = new TennisBall(6);
        System.out.println("Radius: "+ t.rad);
        t.Display();

    }
}