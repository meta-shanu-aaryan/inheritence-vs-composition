package InheritanceVsComposition;

import java.util.Scanner;

import InheritanceVsComposition.Department.Department;
import InheritanceVsComposition.Department.Finance;
import InheritanceVsComposition.Department.RnD;
import InheritanceVsComposition.Employee.Employee;
import InheritanceVsComposition.Employee.FinanceEmployee;
import InheritanceVsComposition.Employee.SoftwareDeveloper;
import InheritanceVsComposition.Organization.Metacube;

public class Main {
    public int intScanner() {
        int n;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                if (n >= 0) {
                    break;
                } else {
                    System.out.println("Positive integers please");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return n;
    }

    public static void main(String[] args) {

        // initialized the metacube organization
        Metacube m = new Metacube("Metacube m1");

        // initialized two departments
        RnD research = new RnD("Research department");
        Finance finance = new Finance("Finance");

        // added departments to organization
        m.addDepartment(research);
        m.addDepartment(finance);

        // initialized employee and joined them to their department
        SoftwareDeveloper shanu = new SoftwareDeveloper("Shanu", 32000, 12000, 5000);
        research.join(shanu);
        SoftwareDeveloper swayam = new SoftwareDeveloper("Swayam", 40000, 10000, 8000);
        research.join(swayam);
        FinanceEmployee ritwik = new FinanceEmployee("Ritwik", 25000, 12000, 10000);
        finance.join(ritwik);
        SoftwareDeveloper raju = new SoftwareDeveloper("Raju", 32000, 7000, 9000);
        research.join(raju);

        // printed info of all rnd employees
        System.out.println("RnD Employees");
        for (Employee emp : research.getEmployees()) {
            emp.getInfo();
        }

        // printed info of all finance employees
        System.out.println("Finance Employees");
        for (Employee emp : finance.getEmployees()) {
            emp.getInfo();
        }

        // relieved raju from research department and printing remaining employees
        research.relieve(raju);
        System.out.println("After relieving raju");
        System.out.println("RnD Employees");
        for (Employee emp : research.getEmployees()) {
            emp.getInfo();
        }

        // printing payslip of all the employees in metacube
        System.out.println("Employees in metacube m1");
        for (Employee emp : m.getAllEmployees()) {
            emp.getInfo();
            emp.printPaySlip();
        }

        // didn't added the menu driven control as in this everything is class based and
        // no factory ADT is used
    }
}
