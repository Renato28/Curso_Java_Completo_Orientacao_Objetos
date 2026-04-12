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

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
//        Integer pos = position(employees, id);
        Employee e = employees
                .stream()
                .filter(integer -> integer.getId() == id)
                .findFirst().orElse(null);
        if (e == null) {
            System.out.println("Employee with id " + id + " not found");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
//            employees.get(pos).increaseSalary(percentage);
            e.increaseSalary(percentage);
        }


        System.out.println("List of employees");
        for(Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    private static Integer position(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> employees, int id) {
        Employee emp = employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
        return emp != null;
    }
}
