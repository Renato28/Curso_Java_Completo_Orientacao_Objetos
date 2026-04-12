package exercio_proposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee e = employees
                .stream()
                .filter(integer -> integer.getId() == id)
                .findFirst().orElse(null);
        if (e == null) {
            System.out.println("Employee with id " + id + " not found");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            e.increaseSalary(percentage);
        }


        System.out.println("List of employees");
        for(Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
