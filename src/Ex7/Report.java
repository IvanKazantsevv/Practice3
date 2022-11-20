package Ex7;

import java.util.Scanner;

public class Report {

    static int n;
    static Employee[] employees;

    Report(int n)
    {
        employees = new Employee[n];
    }

    public void addemployees()
    {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        String fullname;
        int salary;
        for (int i = 0; i < employees.length; i++)
        {
            System.out.print("Введите имя сотрудника: ");
            fullname = in.next();
            System.out.print("Введите зарплату сотрудника: ");
            salary = in.nextInt();
            employees[i] = new Employee(fullname, salary);
        }
    }
    public static void generateReport()
    {
        for (int i = 0; i < employees.length; i++)
        {
            System.out.print(employees[i].getFullname());
            System.out.printf("%15d %n", employees[i].getSalary());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Введите количество сотрудников: ");
        n = in.nextInt();
        Report report = new Report(n);
        report.addemployees();
        generateReport();
    }

}
