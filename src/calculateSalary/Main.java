package calculateSalary;

import calculateSalary.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Asiye Sarıbulak", 1500, 50, 2020);
        employee.tostring();
        System.out.println("vergi : " + employee.tax(employee.getSalary()));
        System.out.println("bonus : " + employee.bonus(employee.getWorkHourse()));
        System.out.println("maaş artışı : " + employee.raiseSalary(employee.getHireYear()));
        System.out.println("vergi ve bonuslarla birlikte maaş : " + employee.VergiVeBonuslarlaMaas() + "$");
        System.out.println("toplam maaş : " + employee.ToplamMaas() + "$");

    }
}