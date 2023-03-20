import java.util.Scanner;

// File Name: SP2023_AdultBMI_Calculator_Coln.java
public class SP2023_AdultBMI_Calculator_Coln {
    public static void main(String[] args) {
        String name;
        int height, weight;
        float bmi;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = keyboard.nextLine();
        System.out.println("Enter height in inches: ");
        height = keyboard.nextInt();
        System.out.println("Enter weight in pounds: ");
        weight = keyboard.nextInt();

        bmi = ((float)weight * 703) / ((float)height * height);

        System.out.println("--------------------------------------------------\n" +
                "File: SP2023_AdultBMI_Calculator_Coln.java\n" +
                "Spring 2023 Semester – PHOENIX COLN\n" +
                "Standard BMI:            18.5 – 24.9\n" +
                "--------------------------------------------------");
        System.out.printf("%-15s %22s %n %-15s %20d %n %-15s %20d %n", "User Name:", name, "Height (inches):",height,"Weight (pounds):", weight);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %22.2f", "BMI:", bmi);
    }
}