package Lesson12;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList){
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }
    public static void main(String[] args) {
        System.out.println(new SalaryCalculator().getTotalSalary(Arrays.asList(new FTE(), new Contractor())));
    }
}
