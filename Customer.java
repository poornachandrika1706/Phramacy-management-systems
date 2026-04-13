

public class Customer {
    private int id;
    private String name;
    private String phone;
    
    public Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    
    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    
    @Override
    public String toString() {
        return String.format("| %-4d | %-20s | %-15s |", id, name, phone);
    }
}