package InheritanceVsComposition;

import InheritanceVsComposition.Department.Finance;
import InheritanceVsComposition.Department.RnD;
import InheritanceVsComposition.Employee.SoftwareDeveloper;
import InheritanceVsComposition.Organization.Metacube;
import InheritanceVsComposition.Employee.Employee;
import InheritanceVsComposition.Employee.FinanceEmployee;

public class Main {
    public static void main(String[] args) {
        Metacube m1 = new Metacube("Metacube M1");
        SoftwareDeveloper shanu = new SoftwareDeveloper("Shanu", 38000.0d, 10000.0d, 5000.0d);
        FinanceEmployee me = new FinanceEmployee("Ritwik", 30000, 12000, 3000);
        RnD r = new RnD("Research and Development");
        Finance f = new Finance("Finance");
        r.join(shanu);
        f.join(me);

        m1.addDepartment(f);
        m1.addDepartment(r);
        

        for (Employee e : f.getEmployees()) {
            e.printPaySlip();
        }

    }

}
