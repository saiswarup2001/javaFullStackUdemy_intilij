package objectClassEqualtoStringHashCode;

import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
class Main  {
    public static void main(String args[]) {
        //creating obj of Laptop class
        Laptop obj1 = new Laptop();
        obj1.model = "Dell Inspiron";
        obj1.price = 50000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell Inspiron";
        obj2.price = 50000;

        System.out.println(obj2.toString()); //toString: getClass().getName() + '@' + Integer.toHexString(hashCode()) ,hashcode: it returns a code of hexa form and it is unique. this two are belongs to same java.util.object class.

        //check for equals
        boolean results = obj1 == obj2;
        System.out.println("Result: "+results);

        //with inbuit method
        boolean res = obj1.equals(obj2);
        System.out.println( "Res: " +res);
    }
}
