import java.util.Scanner;

// File name: SP2023_SharesInvestment_Coln.java
public class SP2023_SharesInvestment_Coln {
    public static void main(String[] args) {
        // Initializing Variables
        String invName;
        int numShares;
        float purchase, sale, totalPurchase, totalSale, profit;
        float commRate = 0.02F;

        // Creating Scanner and taking user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter investor's name: ");
        invName = keyboard.nextLine();
        System.out.println("How many shares?");
        numShares = keyboard.nextInt();
        System.out.println("Price per share when purchased?");
        purchase = keyboard.nextFloat();
        System.out.println("Sale price per share?");
        sale = keyboard.nextFloat();

        // Computing calculations
        totalPurchase = (purchase * numShares) * (1+commRate);
        totalSale = (sale * numShares) * (1-commRate);
        profit = totalSale - totalPurchase;

        // Outputting in desired format
        System.out.println("File: SP2023_ShareInvestment_Coln.java\n" +
                "Spring 2023 semester – PHOENIX COLN\n" +
                "-----------------------------------------------");
        System.out.printf("%-15s%30s%n", "Name of investor:", invName);
        System.out.printf("%-15s%30d%n", "Number of shares:", numShares);
        System.out.printf("%-15s%30.2f%s%n","Commission Rate:", commRate*100, "%");
        System.out.printf("%-15s%18.2f%n","Purchase price of each share:", purchase);
        System.out.printf("%-15s%32.2f%n","Money Invested:", totalPurchase);
        System.out.printf("%-15s%32.2f%n","Sale Price:", sale);
        System.out.printf("%-15s%32.2f%n","Money Returned:", totalSale);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s%20.2f", "Profit from the Investment:", profit);
    }
}