public class InsertionSort {
    // [4, 10, 13, 45, 7, 16, 19, 1, 64, 3]
    //                     i
    //                 j
    // key = 4
    public void sort(int[] arr) {
        // If the array is empty or only has one value
        // there is nothing for us to do
        if(arr.length < 2) {
            return;
        }
        int j;
        for(int i = 0; i < arr.length; i++) {
            j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int key = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j--;
            }
        }
    }
}
