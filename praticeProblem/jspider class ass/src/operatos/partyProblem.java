/*
    Assume Sheela organized a party for their commond friend of 6ppls
    She took 1000/- from everyone including her the expenditure
    was 5400, what should be the amount returned by sheela to
    everyone.
*/

package operatos;

public class partyProblem {
    public static void main(String[] args) {
        int frnd = 6;
        int perHead = 1000;
        int amount = 5400;
        int totalAmount = frnd*perHead+1000;
        System.out.println("The total expenditure is: "+ amount
                +"\n"+"sheela took 1000 from each and the total amount is: "+ totalAmount);
        int leftAmount = totalAmount - amount;
        System.out.println("The total amount left after the party is: "+ leftAmount);
        int returnAmount = leftAmount/(frnd+1);
        System.out.println("So sheela return money to each fellow is: "+ returnAmount);

    }
}
