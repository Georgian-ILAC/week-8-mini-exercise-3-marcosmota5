// COMP1008 - Intro Obj Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week 8 Mini Exercise 3
public class Employee extends Person {
    // Variables declaration
    private int id;
    double hourlyPay;

    // Constructors
    public Employee(int id, double hourlyPay, String firstName, String lastName, int heightFeet, int heightInches) {
        super(firstName, lastName, heightFeet, heightInches);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getHourlyPay(){
        return hourlyPay;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }

    private void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }

    // Methods

    // Makes the employee get a raise of 15%
    //   return: double indicating the new hourly pay
    public double getRaise() {
        // Print an information
        System.out.println("Giving employee 15% of raise...\n");

        // Se the hourly pay to the new one
        hourlyPay *= 1.15;

        // Return the hourly pay
        return hourlyPay;
    }

    // Calculates the total to pay for the week of work
    //   parameters:
    //     workHours: Indicates how many hours the employee worked in the week
    //   return: double indicating the total pay for the week
    public double payDay(double workHours) {
        // Declare the variables
        double totalPay = 0.0;
        double normalHours = 40.0;
        double overtimeRate = 1.5;

        // Print an information
        System.out.println("Calculating the weekly pay...\n");

        // If the hours worked are less or equal than the normal hours amount, set the total pay to be the multiplication
        // of both
        if (workHours <= normalHours) {
            totalPay = workHours * hourlyPay;
        } else {
            // As the workHours is greater than the normal hours, calculate the overtime hours
            double overtimeHours = workHours - normalHours;

            // Set the total pay as the normal hours plus the overtime hours
            totalPay = (normalHours * hourlyPay) + (overtimeHours * hourlyPay * overtimeRate);
        }

        // Return the total pay
        return totalPay;
    }

    // Overrides the toString method to print a customized text
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "They are " + heightFeet + "’" + heightInches + "“\n" +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
