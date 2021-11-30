//           p
// [3, 1, 4, 7, 10, 16, 19, 13, 64, 45]
//        j     i
public class QuickSort {
    private int[] arr;

    public void sort(int[] arr) {
        // If the array is empty or only has one value
        // there is nothing for us to do
        if(arr.length < 2) {
            return;
        }
        this.arr = arr;
        quicksort(0, arr.length - 1);

    }

    private void quicksort(int low, int high) {
        int i = low;
        int j = high;

        // Get the pivot value from the middle of list
        int pivot = middleOfThree(arr[low], arr[low + (high - low) / 2], arr[high]);

        // Divide the array into two sub-arrays
        while(i <= j) {
            // Find the first value in the left part of the array
            // that is greater than the pivot value
            while(arr[i] < pivot) {
                i++;
            }

            // Find the first value in the right part of the array
            // that is smaller than the pivot value
            while(arr[j] > pivot) {
                j--;
            }

            // If we have found a value in the left part of the array that is
            // greater than the pivot value, and we have found a value in the right
            // part of the array that is smaller than the pivot value, then we swap them
            // so the smaller value ends up to the left of pivot, and the greater value
            // to the right of the pivot
            if(i <= j) {
                Util.swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Recursion
        // Work on the left part of the array
        if(low < j) {
            quicksort(low, j);
        }
        // Work on the right part of the array
        if(i < high) {
            quicksort(i, high);
        }
    }

    public static int middleOfThree(int a, int b, int c) {
        if(a > b) {
            if(b > c) {
                return b;
            }
            else return Math.min(a, c);
        }
        else {
            if(a > c) {
                return a;
            }
            else return Math.min(b, c);
        }
    }
}
