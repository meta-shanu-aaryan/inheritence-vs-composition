package InheritanceVsComposition.Department;

import InheritanceVsComposition.Employee.Employee;

public class RnD extends Department {

    public RnD(String departmentName) {
        super(departmentName);
    }

    @Override
    public boolean join(Employee e) {
        try {
            boolean exist = this.employeelist.contains(e);

            if (!exist) {
                this.employeelist.add(e);
                return true;
            }

            return false;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    boolean relieve(Employee emp) {
        try {
            boolean exist = this.employeelist.contains(emp);

            if (exist) {
                this.employeelist.remove(emp);
                return true;
            }

            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
