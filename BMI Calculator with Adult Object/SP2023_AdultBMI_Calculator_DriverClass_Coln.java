import java.util.Scanner;

public class SP2023_AdultBMI_Calculator_DriverClass_Coln {
    public static void main(String[] args) {
        // Initializing variables and scanner
        String name;
        int height, weight;
        Scanner kbd = new Scanner(System.in);

        // Getting input from user
        System.out.println("Enter name:");
        name = kbd.nextLine();
        System.out.println("Enter height in inches:");
        height = kbd.nextInt();
        System.out.println("Enter weight in pounds");
        weight = kbd.nextInt();

        // Creating object
        SP2023_Adult_Coln person = new SP2023_Adult_Coln(name,height,weight);
        // Use toString method
        System.out.println(person.toString());
    }
}