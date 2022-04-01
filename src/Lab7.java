import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Book> myBookList = new ArrayList<>();

        while (isContinuing) {
            System.out.println("========Menu=======");
            System.out.println("1. Input book");
            System.out.println("2. Find book");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select 1 option: ");
            int userInput = scanner.nextInt();
            if (userInput == 0)
                isContinuing = false;
            else {
                switch (userInput) {
                    case 1:
                        System.out.println("Please enter the Book ISBN");
                        Scanner scannerISBN = new Scanner(System.in);
                        String userInputISBN = scannerISBN.nextLine();

                        System.out.println("Please enter the Book Title");
                        Scanner scannerTitle = new Scanner(System.in);
                        String userInputTitle = scannerTitle.nextLine();

                        System.out.println("Please enter the Author Name");
                        Scanner scannerAuthorName = new Scanner(System.in);
                        String userInputAuthorName = scannerAuthorName.nextLine();

                        System.out.println("Please enter the Book Year");
                        Scanner scannerYear = new Scanner(System.in);
                        String userInputYear = scannerYear.nextLine();

                        Book myBook = new Book(userInputISBN, userInputTitle, userInputAuthorName, userInputYear);
                        myBookList.add(myBook);
                        break;

                    case 2:
                        System.out.println("Please enter the Book ISBN");
                        Scanner scannerISBN2 = new Scanner(System.in);
                        String userInputFindISBN = scannerISBN2.nextLine();
                        if (myBookList.size() > 0){
                            for (int i = 0; i < myBookList.size(); i++) {
                                for (Book list : myBookList) {
                                    if (userInputFindISBN.equals(list.getISBN())) {
                                        System.out.println(myBookList.get(i).toString());
                                    } else {
                                        System.out.println("Find not found!");
                                    }
                                }
                            }
                        }else {
                            System.out.println("Find not found!");
                        }
                        break;
                    default:
                        System.out.println("Wrong option");
                }
            }
        }
    }
}
