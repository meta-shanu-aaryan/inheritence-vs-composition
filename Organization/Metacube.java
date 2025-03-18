package InheritanceVsComposition.Organization;

import java.util.ArrayList;
import java.util.List;

import InheritanceVsComposition.Department.Department;
import InheritanceVsComposition.Employee.Employee;

public class Metacube extends Organization {

    public Metacube(String organizationName) {
        super(organizationName);
    }

    @Override
    public boolean addDepartment(Department d) {
        try {
            if (this.departmentList.contains(d)) {
                return false;
            } else {
                this.departmentList.add(d);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> emp = new ArrayList<>();
        for (Department d : this.departmentList) {
            for (Employee e : d.getEmployees()) {
                emp.add(e);
            }
        }

        return emp;
    }

}
