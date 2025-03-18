package InheritanceVsComposition.Department;

import java.util.ArrayList;
import java.util.List;

import InheritanceVsComposition.Employee.Employee;

public abstract class Department {
    protected String departmentName;
    protected List<Employee> employeelist;

    public Department(String departmentName) {
        employeelist = new ArrayList<>();
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return this.employeelist;
    }

    abstract boolean join(Employee e);

    abstract boolean relieve(Employee e);

}