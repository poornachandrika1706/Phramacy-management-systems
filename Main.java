

public class Main {
    private static MedicineService medicineService = new MedicineService();
    private static CustomerService customerService = new CustomerService();
    
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\nPharmacy Management System");
            System.out.println("1. Manage Medicines");
            System.out.println("2. Manage Customers");
            System.out.println("3. Exit");
            
            int choice = InputUtil.getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    manageMedicines();
                    break;
                case 2:
                    manageCustomers();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        InputUtil.closeScanner();
    }
    
    private static void manageMedicines() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\nMedicine Management");
            System.out.println("1. View All Medicines");
            System.out.println("2. Add New Medicine");
            System.out.println("3. Update Medicine Stock");
            System.out.println("4. Back to Main Menu");
            
            int choice = InputUtil.getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    medicineService.displayAllMedicines();
                    break;
                case 2:
                    addNewMedicine();
                    break;
                case 3:
                    updateMedicineStock();
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void addNewMedicine() {
        System.out.println("\nAdd New Medicine");
        String name = InputUtil.getStringInput("Enter medicine name: ");
        double price = InputUtil.getDoubleInput("Enter price: ");
        int quantity = InputUtil.getIntInput("Enter quantity: ");
        String manufacturer = InputUtil.getStringInput("Enter manufacturer: ");
        
        medicineService.addMedicine(name, price, quantity, manufacturer);
        System.out.println("Medicine added successfully!");
    }
    
    private static void updateMedicineStock() {
        medicineService.displayAllMedicines();
        int id = InputUtil.getIntInput("Enter medicine ID to update: ");
        int quantity = InputUtil.getIntInput("Enter quantity to add (use negative to subtract): ");
        
        medicineService.updateMedicineStock(id, quantity);
        System.out.println("Stock updated successfully!");
    }
    
    private static void manageCustomers() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\nCustomer Management");
            System.out.println("1. View All Customers");
            System.out.println("2. Add New Customer");
            System.out.println("3. Back to Main Menu");
            
            int choice = InputUtil.getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    customerService.displayAllCustomers();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void addNewCustomer() {
        System.out.println("\nAdd New Customer");
        String name = InputUtil.getStringInput("Enter customer name: ");
        String phone = InputUtil.getStringInput("Enter phone number: ");
        
        customerService.addCustomer(name, phone);
        System.out.println("Customer added successfully!");
    }
}