package Algorithms;

public class QuickSort extends Algorithm {
    static int start, end;
    
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

    @Override
    public static void run(int start, int end) {
        // base condition/ return early
        if (start >= end) return;

        // rearrange elements across pivot
        int pivot = partition(start, end);

        // recur on subarray containing elements less than the pivot
        run(start, pivot - 1);

        // recur on subarray containing elements more than the pivot
        run(pivot + 1, end);
    }
}   