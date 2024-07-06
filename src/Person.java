// COMP1008 - Intro Obj Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week 8 Mini Exercise 3
public class Person {
    // Variables declaration
    protected  String firstName;
    protected  String lastName;
    protected int heightFeet;
    protected int heightInches;

    // Constructors
    public Person(String firstName, String lastName, int heightFeet, int heightInches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeightFeet(){
        return heightFeet;
    }

    public int getHeightInches(){
        return heightInches;
    }

    // Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setHeightFeet(int heightFeet){
        this.heightFeet = heightFeet;
    }

    private void setHeightInches(int heightInches){
        this.heightInches = heightInches;
    }
}