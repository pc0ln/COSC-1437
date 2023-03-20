public class SP2023_Adult_Coln {
    // Creating private variables
    private String name;
    private int height, weight;

    // Default Constructor
    public SP2023_Adult_Coln() {
        name = "";
        height = weight = 0;
    }

    // Constructor with parameters
    public SP2023_Adult_Coln(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    // Method to calculate BMI using the formula
    public double calculate_BMIRate() {
        return ((double) weight * 703)/ ((double)height * height);
    }

    // Method creates the output string in the correct format
    public String toString(){
        return "-----------------------------------------------------------\n" +
                "File: SP2023_AdultBMI_Calculator_DriverClass_Coln.java\n" +
                "Spring 2023 Semester – PHOENIX COLN\n" +
                "Standard BMI:            18.5 – 24.9\n" +
                "-----------------------------------------------------------\n" +
                String.format("%-29s%10s\n", "Name:", name) +
                String.format("%-29s%10d\n", "Height:", height) +
                String.format("%-29s%10d\n",  "Weight:", weight) +
                "----------------------------------------------------------\n" +
                String.format("%-29s%10.2f\n", "BMI:", calculate_BMIRate());
    }
}
