package InheritanceVsComposition.Organization;

import java.util.ArrayList;
import java.util.List;

import InheritanceVsComposition.Department.Department;
import InheritanceVsComposition.Employee.Employee;

public abstract class Organization {

    protected String organizationName;

    List<Department> departmentList;

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        departmentList = new ArrayList<>();
    }

    abstract boolean addDepartment(Department d);

    abstract List<Employee> getAllEmployees();

}
