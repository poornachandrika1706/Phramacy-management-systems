


import java.util.ArrayList;
import java.util.List;

public class MedicineService {
    private List<Medicine> medicines;
    private int nextId;

    
    public MedicineService() {
        medicines = new ArrayList<>();
        nextId = 1;
        // Add some sample medicines
        addMedicine("Paracetamol", 5.99, 100, "Nalam Pharmacy");
        addMedicine("citrizine", 7.50, 80, " Welcome Pharmacy");
    }
    
    public void addMedicine(String name, double price, int quantity, String manufacturer) {
        Medicine medicine = new Medicine(nextId++, name, price, quantity, manufacturer);
        medicines.add(medicine);
    }
    
    public List<Medicine> getAllMedicines() {
        return new ArrayList<>(medicines);
    }
    
    public Medicine findMedicineById(int id) {
        for (Medicine medicine : medicines) {
            if (medicine.getId() == id) {
                return medicine;
            }
        }
        return null;
    }
    
    public void updateMedicineStock(int id, int quantityChange) {
        Medicine medicine = findMedicineById(id);
        if (medicine != null) {
            medicine.setQuantity(medicine.getQuantity() + quantityChange);
        }
    }
    
    public void displayAllMedicines() {
        System.out.println("\nMedicine List:");
        System.out.println("+------+----------------------+----------+----------+----------------------+");
        System.out.println("| ID   | Name                 | Price    | Quantity | Manufacturer         |");
        System.out.println("+------+----------------------+----------+----------+----------------------+");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
        System.out.println("+------+----------------------+----------+----------+----------------------+");
    }
}