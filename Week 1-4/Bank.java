import java.util.Scanner;
public class Bank {
    Scanner input = new Scanner(System.in);
    static int totalTransaction = 0;
    public int balance;
    public Bank(){
        this.balance=100000;
    }
    public Bank(int balance){
        this.balance=balance;
    }

    public void deposit(){
        System.out.println("Enter Deposit Amount :");
        int deposit = input.nextInt();
        balance +=  deposit;
        totalTransaction += deposit;
        
    }
    public void withdraw(){
        System.out.println("Enter Withdraw Amount :"); 
        int  withdraw=input.nextInt();
        if(balance - withdraw < 0){
            System.out.println("Insufficient Balance!!");
        }else{
            balance -= withdraw;
            totalTransaction -= withdraw;
        } 
    }
    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
       
    }
}
