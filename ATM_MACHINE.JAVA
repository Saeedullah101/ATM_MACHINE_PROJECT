import java.util.*;
class ATM{
    private int PIN = 7421;
    private float Balance;
    public void checkpin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == PIN) {
            menu();
        } else {
            System.out.println("Invalid pin");
            checkpin();

        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println(" 1. check a/c balance ");
        System.out.println(" 2. withdraw money");
        System.out.println(" 3. Deposit money");
        System.out.println(" 4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice==1){
            checkBalance();
        }
        else if (choice==2) {
            withdrawMoney();

        }
        else if (choice==3){
            DepositMoney();
        } else if (choice==4) {
            Exit();

        }
        else {
            System.out.println("Enter a valid choice");
            menu();
        }
    }
    public void checkBalance(){
        System.out.println("Balance is  " +Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount which you withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Withdraw successfully");
            System.out.println("you withdrawn :"+amount+ "amount");
            System.out.println("your ramaining balance is : "+ Balance);
        }

    }
    public void DepositMoney(){
        System.out.println("Enter the amount which you deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("you deposit : " + amount + "$");
        System.out.println("Money Deposit");
        menu();
    }
    public void Exit(){
        System.out.println("Exit Successfully");
        System.exit(0);


    }
}
public class Main{
    public static void main(String [] args){
        ATM obj = new ATM();
        obj.checkpin();
        obj.checkBalance();
        obj.DepositMoney();
        obj.withdrawMoney();
    }
}
