package oops.encapsulationAndDatahiding;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

class Bank{
    private String BName;
    private int AccNo;
    private String cName;

    private double money;

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //deposit
    double cash = 0;
    void DepositAmount(double amount){
        if(getAccNo() != 0){
            cash = amount + getMoney();
            System.out.println(getcName()+ " Deposit "+amount+" successful: "+"\n"+
                    "Total amount is after Deposit: "+ cash);
        }
        System.out.println();
    }

    void withdraw(double cash){
        if(getAccNo() != 0){
            this.cash = this.cash-cash;
            System.out.println("After withdraw amount: "+cash+"\n"+"Remaining Amount is: "+ this.cash);
        }

    }
}
public class BankRun {
    public static void main(String[] args) {
        Bank b = new Bank();
        //System.out.println("Welcome!!,"+b.getcName()+" to PNB Banking...");

        b.setAccNo(12204);
        b.setBName("PNB");
        b.setcName("Sai Swarup");
        b.setMoney(10000);
        System.out.println("Welcome!!,"+b.getcName()+" to PNB Banking...");
        System.out.println();
        b.DepositAmount(1500);
        b.withdraw(500);
        System.out.println();
        System.out.println("Happy Banking");
    }
}
