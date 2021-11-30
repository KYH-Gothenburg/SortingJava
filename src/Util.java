public class Util {
    public static void swap(int[] arr, int i, int j) {
        //arr = [1, 2, 5, 4, 3, 6, 7]
        // i = 4
        // j = 2
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
