public class SelectionSort {
    // [1, 3, 4, 7, 10, 13, 16, 19, 45, 64]
    //                                   i
    //                                   m
    private int[] arr;

    public void sort(int[] arr) {
        this.arr = arr;
        // If the array is empty or only has one value
        // there is nothing for us to do
        if(arr.length < 2) {
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            int minIdx = findLowestIndex(i, arr.length - 1);
            Util.swap(arr, i, minIdx);
        }
    }

    private int findLowestIndex(int start, int end) {
        int minIdx = start;
        while(start <= end) {
            if(arr[start] < arr[minIdx]) {
                minIdx = start;
            }
            start++;
        }
        return minIdx;
    }
}
