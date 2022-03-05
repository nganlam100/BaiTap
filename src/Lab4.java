import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        ArrayList<Integer> myArrayList = new ArrayList<>();

        while (isContinuing) {
            System.out.println("========Menu=======");
            System.out.println("1. Add number into list");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select 1 option: ");
            int userInput = scanner.nextInt();
            if (userInput == 0)
                isContinuing = false;
            else {
                switch (userInput) {
                    case 1:
                        System.out.println("Please enter a number want to add: ");
                        int number = scanner.nextInt();
                        myArrayList.add(number);
                        System.out.println("Your number is added");
                        break;
                    case 2:
                        for (int index = 0; index < myArrayList.size(); index++) {
                            System.out.println("Number is: "+ myArrayList.get(index));
                        }
                        break;
                    case 3:
                        int max = myArrayList.get(0);
                        for (int i = 0; i < myArrayList.size(); i++) {
                            if (myArrayList.get(i).compareTo(max) > 0) {
                                max = myArrayList.get(i);
                            }
                        }
                        System.out.println("Maximum number:" + max);
                        break;
                    case 4:
                        int min = myArrayList.get(0);
                        for (int j = 0; j < myArrayList.size() - 1; j++) {
                            if (myArrayList.get(j).compareTo(min) > 0) {
                                min = myArrayList.get(j);
                            }
                        }
                        System.out.println("Minimum number:" + min);
                        break;
                    default:
                        System.out.println("Wrong option");
                }
            }
        }
    }
}
