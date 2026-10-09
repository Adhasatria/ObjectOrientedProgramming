import java.util.Scanner;
public class BankTry {
    Scanner input = new Scanner(System.in);

    public int balance;
    public BankTry(){
        this.balance=100000;
    }
    public BankTry(int balance){
        this.balance=balance;
    }

    public void deposit(){
        System.out.println("Enter Deposit Amount :");
        int deposit = input.nextInt();
        input.close(); 
        balance +=  deposit;
    }
    public void withdraw(){
        System.out.println("Enter Withdraw Amount :"); 
        int  withdraw=input.nextInt();
        input.close();
        if(balance - withdraw < 0){
            System.out.println("Insufficient Balance!!");
        }else{
            balance -= withdraw;
        } 
    }
    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankTry user1 = new BankTry(100000);
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bank Selong!!");
        System.out.println("Please Choose one of This Action Below!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");


        System.out.println("Current Balance: Rp.1" + user1.balance);
        int pilihan;
        pilihan = input.nextInt();
        

        switch (pilihan) {
            case 1 :
                user1.deposit();
                user1.getBalance();
                break;
            case 2 :
                user1.withdraw();
                user1.getBalance();
                break;
            default:
                System.out.println("Please Enter Number 1 or 2!");
                           
        }
        input.close();
    }
}
