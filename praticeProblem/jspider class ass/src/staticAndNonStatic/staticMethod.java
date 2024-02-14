package staticAndNonStatic;


class AreaRect{
    double len;
    double bre;

    AreaRect(int len, int bre){
        this.len = len;
        this.bre = bre;
    }

    void getArea(){
        System.out.println(len*bre);
    }
}
public class staticMethod {
    public static void main(String[] args) {
        AreaRect a = new AreaRect(3, 4);
        AreaRect b = new AreaRect(11, 22);
        a.getArea();
        b.getArea();
    }
}
