

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    
    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // Clear buffer
        return scanner.nextLine();
    }
    
    public static void closeScanner() {
        scanner.close();
    }
}
