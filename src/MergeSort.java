public class MergeSort {
    private int[] arr;
    private int[] helper;

    public void sort(int[] arr) {
        // If the array is empty or only has one value
        // there is nothing for us to do
        if(arr.length < 2) {
            return;
        }

        this.arr = arr;
        this.helper = new int[arr.length];
        mergesort(0, arr.length-1);
    }

    private void mergesort(int low, int high) {
        // Exit condition
        // check if low is smaller than high, in not, the subarray is sorted
        if(low < high) {
            // Get the index to the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);

            // Merge both sides
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        if(high + 1 - low >= 0) {
            System.arraycopy(arr, low, helper, low, high + 1 - low);
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while(i <= middle && j <= high) {
            // Check if the left side has the lowest value
            if(helper[i] <= helper[j]) {
                arr[k] = helper[i];
                i++;
            } else { // Nope, then the value to the right is the lowest
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the values from the left side
        while(i <= middle) {
            arr[k] = helper[i];
            k++;
            i++;
        }

    }
}
