public class Lab3 {
    public static void main(String[] args) {
        //Count how many odd, even number(s) in an integer array
        int[] intArr = {1, 2, 3, 4, 5};
        int countEvenNumbers = 0;
        int countOddNumbers = 0;

        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intArr[elementIndex] % 2 == 0) {
                countEvenNumbers++;
            }
            if (intArr[elementIndex] % 2 != 0) {
                countOddNumbers++;
            }
        }

        System.out.printf("Có %d số chẵn \n" , countEvenNumbers);
        System.out.printf("Có %d số lẻ", countOddNumbers);
    }
}
