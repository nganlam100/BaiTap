public class Lab3cham3 {
    public static void main(String[] args) {
        //Sort an integer array from min to max
        int[] arr = {12, 34, 1, 16, 28, -1};
        int usp = arr.length - 1;
        while (usp > 0) {
            for (int index = 0; index < usp; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
            usp--;
        }
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
