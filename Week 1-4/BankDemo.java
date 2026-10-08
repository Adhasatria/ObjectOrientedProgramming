import java.util.Scanner;

public class BankDemo{
    public static void main(String[] args) {
        BankTry user1 = new BankTry(100000);
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do{
        System.out.println("Welcome to Bank Selong!!");
        System.out.println("Please Choose one of This Action Below!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("0. Quit");

       
        System.out.println("Current Balance: Rp." + user1.balance);
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1 :
                user1.deposit();
                System.out.println(user1.getBalance()); 
                System.out.println("Total transaction = " + BankTry.totalTransaction);
                break;
            case 2 :
                user1.withdraw();
                System.out.println(user1.getBalance());
                System.out.println("Total transaction = " + BankTry.totalTransaction ); 
                break;
            case 0 :
                System.out.println("Goodbye!!!!");
                break;
            default:
                System.out.println("Please Enter Number 0, 1 or 2!");
                           
            }
        }while(pilihan != 0);
        input.close();
    }

}