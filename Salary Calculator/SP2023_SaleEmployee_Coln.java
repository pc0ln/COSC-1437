// File name: SP2023_SaleEmployee_Coln.java
public class SP2023_SaleEmployee_Coln {
    //Initialize the variables
    private String name, employeeId;
    private float saleAmount;
    private final float BASE = 2300.00f;

    // Default constructor no parameters
    public SP2023_SaleEmployee_Coln() {
        name = employeeId = "";
        saleAmount = 0;
    }

    // Constructor with parameters
    public SP2023_SaleEmployee_Coln(String n, String id, float sale) {
        name = n;
        employeeId = id;
        saleAmount = sale;
    }

    // Method to calculate commission
    public float calcCommission(float sale) {
        if(sale >= 15000) {
            return sale * .0329f;
        } else if (sale >= 5000) {
            return sale * .0279f;
        } else {
            return 0;
        }
    }

    // Method to calculate bonus
    public float calcBonus(float sale) {
        if(sale > 10000) {
            return (sale - 10000) * .0199f;
        } else {
            return 0;
        }
    }

    // Method to calculate salary
    public float calcSalary(float sale) {
        return BASE + calcCommission(sale) + calcBonus(sale);
    }

    // Method for toString
    public String toString() {
        return "File: SP2023_SaleEmployeeSalary_Coln.java\n" +
                "SP2023 SALE COMPANY               PHOENIX COLN\n" +
                "Today:                               02/19/2023\n" +
                "----------------------------------------------------\n" +
                String.format("%-29s%15s%n","Employee Id:", employeeId) +
                String.format("%-29s%15s%n","Employee Name:", name) +
                String.format("%-29s%15.2f%n","Sale Amount:", saleAmount) +
                "----------------------------------------------------\n" +
                String.format("%-29s%15.2f%n","Base Salary:",BASE) +
                String.format("%-29s%15.2f%n","Commission Amount",calcCommission(saleAmount)) +
                String.format("%-29s%15.2f%n","Bonus Amount",calcBonus(saleAmount))+
                String.format("%-29s%15.2f%n","Salary:",calcSalary(saleAmount))+
                "----------------------------------------------------\n";
    }
}
