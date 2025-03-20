package InheritanceVsComposition.Organization;

import java.util.ArrayList;
import java.util.List;

import InheritanceVsComposition.Department.Department;
import InheritanceVsComposition.Employee.Employee;

public abstract class Organization {

    protected String organizationName;

    List<Department> departmentList;

    /**
     * @param organizationName to set name of organization
     */
    public Organization(String organizationName) {
        this.organizationName = organizationName;
        departmentList = new ArrayList<>();
    }

    /**
     * @param d object of department to add
     * @return true if added successfullt
     */
    abstract boolean addDepartment(Department d);

    /**
     * @return arrayList of all the employees in the organization
     */
    abstract List<Employee> getAllEmployees();

}
