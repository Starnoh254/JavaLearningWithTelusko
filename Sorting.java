import java.util.Arrays;

public class Sorting {
    public static void main(String args[]) {
        int[] arr = { 4, 8, 2, 1, 3, 7, 5 };
        bubbleSort(arr);
        selectionSort(arr);
        selectionSortMin(arr);
        insertionSort(arr);
        insertionSortSolution(arr);
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

    public static void insertionSort(int arr[]) {
        // int[] arr = { 4, 8, 2, 1, 3, 7, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int k = i;
            int temp = arr[j];

            while (k >= 0 && arr[k] > temp) {
                arr[k + 1] = arr[k];
                k--;
            }

            arr[k + 1] = temp;
        }
        System.out.println("Here is your sorted array using insertionSort : " + Arrays.toString(arr));
    }

    public static void insertionSortSolution(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        System.out.println("Here is your sorted array using insertionSortTelusko : " + Arrays.toString(arr));
    }
}