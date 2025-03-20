package InheritanceVsComposition.Department;

import java.util.ArrayList;
import java.util.List;

import InheritanceVsComposition.Employee.Employee;

public abstract class Department {
    protected String departmentName;
    protected List<Employee> employeelist;

    /**
     * @param departmentName Takes name of department and set it
     */
    public Department(String departmentName) {
        employeelist = new ArrayList<>();
        this.departmentName = departmentName;
    }

    // getter
    public List<Employee> getEmployees() {
        return this.employeelist;
    }

    /**
     * @param e object of employee
     * @return true if joined successfully
     */
    abstract boolean join(Employee e);

    /**
     * @param e object of employee
     * @return true if removed succesfully
     */
    abstract boolean relieve(Employee e);

}