import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        bank.addCustomer("Adha", "Satria");
        bank.addCustomer("Budi", "Santoso");
        bank.addCustomer("Slamet", "Kopling");
        bank.addCustomer("Isaac", "Newton");

        Scanner input = new Scanner(System.in);
        int customerChoice;

        do {
            System.out.println("\nPilih customer:");
            for(int i = 0; i < bank.getNumOfCustomers(); i++){
                Customer customer = bank.getCustomer(i);
                System.out.println((i + 1) + ". " + customer.getFirstName() + " " + customer.getLastName()+ " (Saldo: Rp." + customer.getBalance() + ")");
            }
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            customerChoice = input.nextInt();

            if(customerChoice == 0){
                break;
            }
            if(customerChoice < 1 || customerChoice > bank.getNumOfCustomers()){
                System.out.println("Pilihan customer tidak valid.");
                continue;
            }

            Customer customer = bank.getCustomer(customerChoice - 1);
            System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());

            System.out.println("Saldo: Rp." + customer.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("0. Kembali");
            System.out.print("Pilihan transaksi: ");
            int action = input.nextInt();

            if(action == 0){
                continue;
            }
            if(action != 1 && action != 2){
                System.out.println("Pilihan transaksi tidak valid.");
                continue;
            }

            System.out.print("Jumlah: Rp.");
            int amount = input.nextInt();
            if(amount <= 0){
                System.out.println("Jumlah harus lebih dari 0.");
            }else if(action == 1){
                customer.deposit(amount);
            }else if(action == 2 && !customer.withdraw(amount)){
                System.out.println("Saldo tidak mencukupi.");
            }else if(action != 2){
                System.out.println("Pilihan transaksi tidak valid.");
            }

            System.out.println("Saldo " + customer.getFirstName() + ": Rp." + customer.getBalance());
        } while(true);

        input.close();
        System.out.println("Terima kasih.");
    }
}
