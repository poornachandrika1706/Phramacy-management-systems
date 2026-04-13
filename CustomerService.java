
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;    
    
    private int nextId;
    
    public CustomerService() {
        customers = new ArrayList<>();
        nextId = 1;
        // Add some sample customers
        addCustomer("Yukesh", "8054759678");
        addCustomer("Vikram", "9876543210");
    }
    
    public void addCustomer(String name, String phone) {
        Customer customer = new Customer(nextId++, name, phone);
        customers.add(customer);
    }
    
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }
    
    public Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    
    public void displayAllCustomers() {
        System.out.println("\nCustomer List:");
        System.out.println("+------+----------------------+-----------------+");
        System.out.println("| ID   | Name                 | Phone           |");
        System.out.println("+------+----------------------+-----------------+");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("+------+----------------------+-----------------+");
    }
}