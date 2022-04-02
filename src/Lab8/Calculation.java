package Lab8;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        double SALARY_FULL_TIME_EMP = 50000;
        double SALARY_CONTRACT_EMP = 40000;
        int WORKING_DAY = 26;

        Scanner userInputFTEmp = new Scanner(System.in);
        System.out.println("How many full time employee?");
        int numberFTE = userInputFTEmp.nextInt();

        Scanner userInputContractEmp = new Scanner(System.in);
        System.out.println("How many contract employee?");
        int numberContract = userInputContractEmp.nextInt();

        Scanner userInputMonth = new Scanner(System.in);
        System.out.println("Please enter a month want to check?");
        int month = userInputMonth.nextInt();

        Calculation calculation = new Calculation();

        int actualWorkingDay = calculation.workingDayCal(month);

        double salaryFTEmp = calculation.salaryEmp(SALARY_FULL_TIME_EMP, WORKING_DAY, actualWorkingDay);
        double salaryContractEmp = calculation.salaryEmp(SALARY_CONTRACT_EMP, WORKING_DAY, actualWorkingDay);

        double salaryFTETotal = salaryFTEmp * numberFTE;
        double salaryContractTotal = salaryContractEmp * numberContract;

        System.out.printf("Total salary of Full Time Employee: %.2f \n", salaryFTETotal);
        System.out.printf("Total salary of Contract Employee: %.2f", salaryContractTotal);
    }

    public double salaryEmp(double salary, double workingDay, double actualWorkingDay) {
        return salary / workingDay * actualWorkingDay;
    }

    public int workingDayCal(int month) {
        int actualWorkingDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                actualWorkingDay = 27;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                actualWorkingDay = 26;
                break;
            case 2:
                Scanner userInputYear = new Scanner(System.in);
                System.out.println("Please enter a year: ");
                int year = userInputYear.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    actualWorkingDay = 25;
                } else {
                    actualWorkingDay = 24;
                }
                break;
            default:
                System.out.println("Invalid date");
        }
        return actualWorkingDay;
    }
}
