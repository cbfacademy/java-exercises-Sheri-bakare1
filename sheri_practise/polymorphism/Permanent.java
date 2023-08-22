package polymorphism;

public class Permanent extends Person {
    
    //variables 
    private float dayRate;
    private int daysWorked;

    public Permanent(String x, String y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    public float calculateSalary() {
        return this.dayRate * this.daysWorked; 
    }

    public void setDayrate( float dayRate) {
        this.dayRate = dayRate;
    }

    public float getDayrate() {
        return this.dayRate;
    }
    public void setdaysWorked( int daysWorked) {
        this.daysWorked = daysWorked;
        }

    public int getDaysWorked() {
        return this.daysWorked;
        }

}

