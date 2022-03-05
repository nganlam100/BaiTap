import java.util.Scanner;

public class Lab2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cân nặng bà ơi (kg): ");
            double weight = scanner.nextDouble();
            System.out.println("Nhập chiều cao bà ơi (m): ");
            double height = scanner.nextDouble();

            double BMI = weight / (height * height);
            System.out.printf("Chỉ số BMI của bà nè: %.2f \n", BMI);

            if (BMI <  18.5)
                System.out.println("Ốm quá dòi bà ơi");
            if (BMI >=  18.5 &&  BMI <= 24.99)
                System.out.println("Vừa đủ cân bán rồi nhé");
            if (BMI >=  25 && BMI <= 29.9)
                System.out.println("Hơi béo ròi đó");
            if (BMI >=  30 )
                System.out.println("Mập lố ròi bà ơi ");

    }
}
