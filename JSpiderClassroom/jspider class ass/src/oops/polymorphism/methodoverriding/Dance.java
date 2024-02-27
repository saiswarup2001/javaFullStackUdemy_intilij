package oops.polymorphism.methodoverriding;

class Sheela{
    void DanceForm(){
        System.out.println("Sheela's dance Form : Shalsha and Kathak");
    }
}

class Jeet extends Sheela{
    @Override
    void DanceForm(){
        System.out.println("Jeet's dance Form : Hip-Hop and Popping");
    }
}
public class Dance {
    public static void main(String[] args) {
        Jeet j = new Jeet();
        j.DanceForm();
        Sheela s = new Sheela();
        s.DanceForm();
    }
}
