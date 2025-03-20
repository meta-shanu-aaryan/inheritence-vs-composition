package InheritanceVsComposition.Employee;

public abstract class Employee {
    protected String name;
    protected double basicSalary;
    protected double bonus;
    protected double compensation;

    public Employee(String name, double basicSalary, double bonus, double compensation) {

        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.compensation = compensation;
    }

    abstract double getBasicSalary();

    abstract double getBonus();

    abstract double getCompensation();

    public void getInfo() {
        System.out.println(this.name);
    }

    public double getTotalSalary() {
        return getBasicSalary() + getBonus() + getCompensation();
    }

    public void printPaySlip() {
        System.out.println("---------------------------------");
        System.out.println("            Pay Slip             ");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Name:-\t" + this.name);
        System.out.println();
        System.out.println("Basic Salary:-\t" + getBasicSalary());
        System.out.println("Bonus:-\t" + getBonus());
        System.out.println("Compensation:-\t" + getCompensation());
        System.out.println("Total Salary:-\t" + getTotalSalary());
        System.out.println();
        System.out.println("----------------------------------");
    }

    public void printSlip() {
        System.out.print(this.name + "\t" + this.basicSalary + "\t" + this.bonus + "\t" + this.compensation);
    }
}