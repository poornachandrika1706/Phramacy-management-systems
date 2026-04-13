

public class Medicine {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    
    public Medicine(int id, String name, double price, int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getManufacturer() { return manufacturer; }
    
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
    @Override
    public String toString() {
        return String.format("| %-4d | %-20s | %-8.2f | %-8d | %-20s |", 
                id, name, price, quantity, manufacturer);
    }
}