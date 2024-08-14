package Algorithms;

// Got the code from a website, hence the execessive comments
// Don't remember where...

public class QuickSort extends Algorithm {
    private static int start, end;

    // Partition using the Lomuto partition scheme
    private static int partition(int start, int end) {
        // Pick the rightmost element as a pivot from the array
        int pivot = arr[end];

        // elements less than the pivot will be pushed to the left of `pIndex`
        // elements more than the pivot will be pushed to the right of `pIndex`
        // equal elements can go either way
        int pIndex = start;

        // each time we find an element less than or equal to the pivot,
        // `pIndex` is incremented, and that element would be placed
        // before the pivot.
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(i, pIndex);
                pIndex++;
            }
        }

        // swap `pIndex` with pivot
        swap(end, pIndex);

        // return `pIndex` (index of the pivot element)
        return pIndex;
    }
    private static void recSort(int start, int end) {
        // base condition/ return early
        if (start >= end) return;

        // rearrange elements across pivot
        int pivot = partition(start, end);

        // recur on subarray containing elements less than the pivot
        recSort(start, pivot - 1);

        // recur on subarray containing elements more than the pivot
        recSort(pivot + 1, end);   
    }


    public static int[] sort(int [] arr) {
        init(arr);
        recSort(start, end);
        return arr;
    }
    public static int[] timedSort(int [] arr) {
        init(arr);

        startTime = System.currentTimeMillis();
        recSort(start, end);
        endTime = System.currentTimeMillis();
        
        return arr;
    }
}   