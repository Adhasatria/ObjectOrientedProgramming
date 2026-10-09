public class Customer {
    private final String firstName;
    private final String lastName;
    private int balance;

    public Customer(String firstName, String lastName, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public boolean withdraw(int amount){
        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }
}
