/*
Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it.
Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:

1 - without any parameter - no amount will be added to the Saving Box

2 - having a parameter which is the amount that will be added to Saving Box

Create object of the 'AddAmount' class and display the final amount in Saving Box. Also,
create a method that can display how many transactions are done on the Saving Box.
 */
public class Main {

    public static void main(String[] args) {
            AddAmount  addAmount1 = new AddAmount(29);
            AddAmount  addAmount2 = new AddAmount();
    }
}

class AddAmount{

    private double amount = 50;

    AddAmount(){
        setAmount(0);
        printMe();
    }

    AddAmount(double amount){
        setAmount(amount);
        printMe();
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    public double getAmount() {
        return amount;
    }

    public void printMe(){
        System.out.println("Total amount: " + amount);
    }
}
