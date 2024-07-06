// COMP1008 - Intro Obj Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week 8 Mini Exercise 3
public class Main {
    public static void main(String[] args) {

        // Print a message informing program details
        System.out.println("############### Java Program - Week 8 Mini Exercise 3 - v1.0 ###############\n");

        // Creates a new instance of the employee class passing the required parameters
        Employee emp = new Employee(200564426, 45, "Marcos", "Mota", 5, 10);

        // Print the employee information
        System.out.println("Employee information: \n\n" + emp.toString());

        // Set the worked hours
        double workedHours = 47.0;

        // Calculate the weekly pay for the employee and stores it to the variable
        double weeklyPay = emp.payDay(workedHours);

        // Print the weeklyPay information
        System.out.println("For " + workedHours + " hours worked, the payment is: " + weeklyPay + "\n");

        // Give a raise to the employee and get the new hourly pay
        double newHourlyPay = emp.getRaise();

        // Print the new hourlyPay
        System.out.println("New hourly pay: " + newHourlyPay + "\n");

        // Print the employee information again just to show the changes
        System.out.println("Employee information: \n\n" + emp.toString());
    }
}