package polymorphism;


public class App {
    
    public static void main(String[] args) {
       // contractor is a shell that operates on the assigned values
        Contractor c1 = new Contractor("Sally", "Perkins");
        c1.setRate(50.0f);
        c1.setHoursWorked(160);
        float salary = c1.calculateSalary();
        System.out.println("My salary is: " + salary + " with a rate of: " + c1.getRate());
        
        Contractor c2 = new Contractor("John", "Boyega");
        c2.setRate(10.0f);
        c2.setHoursWorked(200);
        float salary2 = c2.calculateSalary();
        System.out.println("My salary is: " + c2.calculateSalary() + " with a rate of: " + c2.getRate());

        String name = c1.getFullName();
        System.out.println(name);

        Permanent c3 = new Permanent("James","Truffle");
        c3.setDayrate(700.0f);
        c3.setdaysWorked(20);
        float monthlySalary = c3.calculateSalary();
        System.out.println("My monthly wage is: " + c3.calculateSalary());
    }

}
