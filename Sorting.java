import java.util.Arrays;

public class Sorting {
    public static void main(String args[]) {
        int[] arr = { 4, 8, 2, 1, 3, 7, 5 };
        bubbleSort(arr);
        selectionSort(arr);
        selectionSortMin(arr);
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Here is your sorted array : " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = 0;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            int last = arr.length - 1 - i;
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;

        }

        System.out.println("Here is your sorted array : " + Arrays.toString(arr));
    }

    public static void selectionSortMin(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

        System.out.println("Here is your sorted array using selectionSortMin: " + Arrays.toString(arr));
    }
}