import java.util.Arrays;

public class Lab3cham4 {
    public static void main(String[] args) {
        //merge two sorted arrays
        int[] arr1 = {1, 7, 12, 16, 24, 33, 35};
        int[] arr2 = {1, 7, 16, 28, 34, 99};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] mergeArr = new int[arr1Length + arr2Length];

        int arr1Index = 0;
        int arr2Index = 0;
        int mergeIndex = 0;

        while (arr1Index < arr1Length && arr2Index < arr2Length){
            if (arr1[arr1Index] < arr2[arr2Index]){
                mergeArr[mergeIndex] = arr1[arr1Index];
                mergeIndex++;
                arr1Index++;
            }else {
                mergeArr[mergeIndex] = arr2[arr2Index];
                mergeIndex++;
                arr2Index++;
            }
        }

        while (arr1Index < arr1Length){
            mergeArr[mergeIndex++] = arr1[arr1Index++];
        }

        while (arr2Index < arr2Length){
            mergeArr[mergeIndex++] = arr2[arr2Index++];
        }

        for (int value : mergeArr){
            System.out.println(value + " ");
        }
    }
}
