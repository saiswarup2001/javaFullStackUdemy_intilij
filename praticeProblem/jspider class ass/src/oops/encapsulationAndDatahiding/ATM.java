package oops.encapsulationAndDatahiding;

class DetailsAtm{
    private int atmId;
    private String loc;
    private double money;

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    double cash = 0;
    void DepositAmount(int amount){
        cash = amount + getMoney();
        System.out.println("Deposit amount: "+ cash);
    }

    void withdraw(double cash){
        this.cash = this.cash-cash;
        System.out.println("After withdraw: "+ this.cash);
    }
}
public class ATM {
    public static void main(String[] args) {
        DetailsAtm d = new DetailsAtm();
        d.setAtmId(1);
        d.setLoc("BAM");
        d.setMoney(1000);

        d.DepositAmount(200);
        d.withdraw(500);
    }
}
