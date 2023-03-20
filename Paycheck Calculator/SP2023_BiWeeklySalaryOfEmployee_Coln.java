import java.util.Scanner;

public class SP2023_BiWeeklySalaryOfEmployee_Coln {
    public static void main(String[] args) {
        String name, id;
        float wage;
        int hours;

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter name:");
        name = kbd.nextLine();
        System.out.println("Enter id:");
        id = kbd.nextLine();
        System.out.println("Enter hourly rate:");
        wage = kbd.nextFloat();
        System.out.println("Enter amount of hours");
        hours = kbd.nextInt();

        SP2023_Employee_Coln employee = new SP2023_Employee_Coln(id,name,wage,hours);
        System.out.println(employee.toString());
    }
}
