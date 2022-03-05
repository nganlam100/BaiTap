public class Lab3cham2 {
    public static void main(String[] args) {
        //Finding maximum value/minimum value from an integer array
        int[] intArr = {3, 2, 1, 4, 5};
        int minimum = intArr[0];
        int maximum = intArr[0];

        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intArr[elementIndex] < minimum){
                minimum = intArr[elementIndex];
            }
            if (intArr[elementIndex] > maximum){
                maximum = intArr[elementIndex];
            }
        }

        System.out.printf("Minimum: %d \n", minimum);
        System.out.printf("Maximum: %d", maximum);
    }
}
