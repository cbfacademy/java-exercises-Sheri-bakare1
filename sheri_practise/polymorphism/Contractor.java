package polymorphism;

public class Contractor extends Person {

    private float rate;
    private int hoursWorked;

    public Contractor(String x, String y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    public float calculateSalary() {
       return this.hoursWorked * this.rate;
    }
    // this is a setter - it doesn't return anything. It is to assign a value to the variable above (float rate). The setter gives us a value 
    public void setRate(float rate){
        this.rate = rate;   
    }
    // this is the getter, we are not assigning a value to it. It is getting the information that was obtained by the setter
    public float getRate(){
        return this.rate;
    }
    // the name of the method is on the left and the value that you're passing in is on the right
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    //the getter data type should be the same as the setter
    public int getHoursWorked(){
        return this.hoursWorked;
    }
}
