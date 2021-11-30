import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void printArr(int[] arr) {
        // [1, 2, 3, 4, 5, 6, 7]
        // [1, 2, 3, 4, 5, 6, 7]
        StringBuilder str = new StringBuilder();
        str.append("[");
        String prefix = "";
        for(int value : arr) {
            str.append(prefix);
            prefix = ", ";
            str.append(value);
        }
        str.append("]");
        System.out.println(str.toString());
    }

    public static void selectionSorter(int[] arr) {
        //int[] arr = {45, 13, 4, 10, 7, 16, 19, 1, 64, 3};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        //printArr(arr);
    }

    public static void insertionSorter(int[] arr) {
        //int[] arr = {45, 13, 4, 10, 7, 16, 19, 1, 64, 3};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        //printArr(arr);
    }

    public static void mergeSorter(int[] arr) {
        //int[] arr = {45, 13, 4, 10, 7, 16, 19, 1, 64, 3};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        //printArr(arr);
    }

    public static void driver() {
        int elements = 100000;
        int[] arr = new int[elements];
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            arrList.add(i);
        }
        Collections.shuffle(arrList);
        for(int i = 0; i < elements; i++){
            arr[i] = arrList.get(i);
        }
        int[] arrInsertion = Arrays.copyOf(arr, elements);
        long startTime = System.currentTimeMillis();
        insertionSorter(arrInsertion);
        long endTime = System.currentTimeMillis();
        System.out.println("Insertion sort took " +(endTime - startTime) + " milliseconds");

        int[] arrSelection = Arrays.copyOf(arr, elements);
        startTime = System.currentTimeMillis();
        selectionSorter(arrSelection);
        endTime = System.currentTimeMillis();
        System.out.println("Selection sort took " +(endTime - startTime) + " milliseconds");

        int[] arrMerge = Arrays.copyOf(arr, elements);
        startTime = System.currentTimeMillis();
        mergeSorter(arrMerge);
        endTime = System.currentTimeMillis();
        System.out.println("Merge sort took " +(endTime - startTime) + " milliseconds");


    }


    public static void main(String[] args) {
        driver();

    }
}
