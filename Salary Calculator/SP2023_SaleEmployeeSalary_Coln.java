import java.util.Scanner;

// File name SP2023_SaleEmployeeSalary_Coln.java
public class SP2023_SaleEmployeeSalary_Coln {
    public static void main(String[] args) {
        // New Scanner object
        Scanner kbd = new Scanner(System.in);
        // Initialize the variables
        String name, id;
        float sale;

        // Asking for and getting user input
        System.out.println("Enter name:");
        name = kbd.nextLine();
        System.out.println("Enter id:");
        id = kbd.nextLine();
        System.out.println("Enter sale amount:");
        sale = kbd.nextFloat();

        // Create new sale employee object with user parameters
        SP2023_SaleEmployee_Coln employee = new SP2023_SaleEmployee_Coln(name,id,sale);
        // Print slip with objects toString()
        System.out.println(employee);
    }
}