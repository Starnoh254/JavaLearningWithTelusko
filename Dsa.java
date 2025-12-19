public class Dsa {
    public static void main (String args [] ) {
        int sortedArray[] = {2,4,6,8};
        int start = 0;
        int end = sortedArray.length - 1;
        int index = binarySearchRecursion(8,sortedArray, start , end);
        System.out.println("The position of the target in the array is " + index);

    }

    private static int linearSearch(int target , int array[]) {
        int size = array.length;

        for(int i = 0; i < size; i++) {
            if(array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int target , int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(array[mid] == target) {
                return mid;
            }

            if(array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private static int binarySearchRecursion(int target , int array[] , int start , int end) {
        if(start > end ) {
            return -1;
        }

        int mid = (start + end) / 2;
        if(array[mid] == target) {
            return mid;
        }
        else if(array[mid] > target) {
            return binarySearchRecursion(target, array, start, mid - 1);
        }
        else{
            return binarySearchRecursion(target, array, mid + 1, end);
        }
    }
}
