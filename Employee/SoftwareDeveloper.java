package InheritanceVsComposition.Employee;

public class SoftwareDeveloper extends Employee {

    public SoftwareDeveloper(String name, double basicSalary, double bonus, double compensation) {
        super(name, basicSalary, bonus, compensation);
    }

    /**
     * @return name of employee
     */
    public String getName() {
        return this.name;
    }

    @Override
    public double getBasicSalary() {
        return this.basicSalary;
    }

    @Override
    public double getBonus() {
        return this.bonus;
    }

    @Override
    public double getCompensation() {
        return this.compensation;
    }

}
