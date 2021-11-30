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

    }
}
