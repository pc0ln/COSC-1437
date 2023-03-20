public class SP2023_Employee_Coln {
    private String employeeId, name;
    private float wage, gross;
    private int hours;

    private final float FEDERAL = .0874f;
    private final float SOCIAL = .0620f;
    private final float MEDICARE = .0145f;

    

    public SP2023_Employee_Coln(){
        employeeId = name = "";
        wage = gross = hours = 0;
    }

    public SP2023_Employee_Coln(String id, String n, float w, int h) {
        employeeId = id;
        name = n;
        wage = w;
        hours = h;
        gross = wage * hours;
    }

    public float calculateFedTax(float g){
        return g * FEDERAL;
    }

    public float calculateSocialTax(float g){
        return g * SOCIAL;
    }

    public float calculateMedicareTax(float g){
        return g * MEDICARE;
    }

    public float calculateNetPay(float g){
        return g-(calculateFedTax(g) + calculateSocialTax(g) + calculateMedicareTax(g));
    }

    public String toString() {
        return "File: SP2023_BiWeeklySalaryOfEmployee_Coln.java\n" +
                " BIWEEKLY PAYMENT OF EMPLOYEE – PHOENIX COLN\n" +
                " ....................................................\n" +
                String.format("%-29s%10s\n","Employee ID:", employeeId) +
                String.format("%-29s%10s\n", "Sale Employee Name:", name)     +
                String.format("%-29s%10.2f\n","Hour Salary:", wage)+
                String.format("%-32s%7d\n","Number of work hours in 2 weeks:", hours)+
                " ....................................................\n" +
                String.format("%-29s%10.2f\n","Gross Pay:",gross)+
                String.format("%-29s%10.2f\n","Federal Income Tax (8.74%):",calculateFedTax(gross))+
                String.format("%-29s%10.2f\n","Social Security Tax (6.20%):",calculateSocialTax(gross))+
                String.format("%-29s%10.2f\n","Medicare Tax (1.45%):",calculateMedicareTax(gross))+
                " ....................................................\n" +
                String.format("%-29s%10.2f","Net Pay:",calculateNetPay(gross));
    }
}