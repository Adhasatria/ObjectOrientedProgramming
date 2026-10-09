import java.util.ArrayList;

public class Bank {
    private final ArrayList<Customer> customers;
    private final int initialBalance;

    public Bank(){
        this(100000);
    }

    public Bank(int initialBalance){
        this.initialBalance = initialBalance;
        this.customers = new ArrayList<>(10);
    }

    public void addCustomer(String firstName, String lastName){
        customers.add(new Customer(firstName, lastName, initialBalance));
    }

    public int getNumOfCustomers(){
        return customers.size();
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }
}
