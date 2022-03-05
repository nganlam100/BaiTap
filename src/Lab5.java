import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Map<Integer, String> studentList = new HashMap<>();

        while (isContinuing) {
            System.out.println("========Menu=======");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select 1 option: ");
            int userInput = scanner.nextInt();

            if (userInput == 0)
                isContinuing = false;
            else {
                switch (userInput) {
                    case 1:
                        System.out.println("Please input student name: ");
                        String stuName = scanner.next();
                        System.out.println("Please input student ID: ");
                        int stuId = scanner.nextInt();
                        studentList.put(stuId, stuName);
                        break;
                    case 2:
                        System.out.println("Please input student ID want to find: ");
                        int Id = scanner.nextInt();
                        if(studentList.get(Id) == null)
                            System.out.println("Student with ID not found...!");
                        else {
                            System.out.println("Student Name is: " + studentList.get(Id));
                        }
                        break;
                    default:
                        System.out.println("Wrong option");
                }
            }
        }
    }
}
