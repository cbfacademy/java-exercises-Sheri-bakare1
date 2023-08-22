package polymorphism;

public abstract class Person {

    //the variables/attributes are protected so the subclasses can access the data stored without needing getters and setters
    private String firstName;
    protected String lastName;
    
    //the constructor helps when creating instances to add specific information
    public Person( String x, String y) {
        this.firstName = x;
        this.lastName = y;

    }
    //this is the abstract method that will be defined down the line
    public abstract float calculateSalary();

    //I don't need a setter in this case because the constructor has assigned a value (x) to the variable which the getter can access
    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName() {
        return getFirstName() + " " + this.lastName;
    }

}
