package Lesson12_Interface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    int getTotalSalary(List<IEmployee> employeeList){
        int totalSalary = 0;
        for (IEmployee employee : employeeList) {
            totalSalary = totalSalary + employee.getTotalSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        List<IEmployee> employeeList = Arrays.asList(new FTE(), new Contractor());
        System.out.println(new SalaryCalculator().getTotalSalary(employeeList));
    }
}
