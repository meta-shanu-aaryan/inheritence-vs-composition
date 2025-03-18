package InheritanceVsComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import InheritanceVsComposition.Employee.Employee;
import InheritanceVsComposition.Organization.Metacube;

public class PaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            sc.close();
        }
        Metacube metacube = new Metacube("metacube");
        List<Employee> emp = new ArrayList<>(metacube.getAllEmployees());

        for (Employee e : emp) {
            e.printSlip();
            System.out.println(e.getTotalSalary() > 100000 ? e.getTotalSalary() * 0.8 : e.getTotalSalary() * 0.9);
        }

    }
}
