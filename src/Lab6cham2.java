import java.util.Scanner;

public class Lab6cham2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int count = 0;

        while (count < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a password: ");
            String userInput = scanner.next();
            if (userInput.equals(myPassword)) {
                System.out.println("Login successful!!");
                break;
            } else {
                System.out.println("Incorrect Password");
                count = count + 1;
            }
        }
    }
}
