import java.lang.reflect.Method;
import java.util.Arrays;

public class Algorithm {
    static String algorithmFunctionName = "run"; 
    static int check, swap;
    static long startTime, endTime;
    
    static int[] arr;
    
    static void init (int [] newArr) {
        arr = newArr;
        check = swap = 0;
    }
    static void swap (int posA, int posB) {
        swap++;
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
    static boolean check (int a, int b) {
        check++;
        return a > b;
    }
    static void printArray() {
        Arrays.toString(arr);
    }


    class BubbleSort {
        private static void run() {
            //Doing it like this makes it more of a 
            //bubble algorithm instead of a sinking algorithm
            for (int i = arr.length - 1; i > 0 ; i--) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (check(arr[j - 1],arr[j])) {
                        swap(j - 1, j);
                    }
                }
            }
        }
        private static void runOptimized() {
            boolean entryWasSwapped;
            for (int i = arr.length - 1; i > 0 ; i--) {
                entryWasSwapped = false;
                for (int j = arr.length - 1; j > i; j--) {
                    if (check(arr[j - 1],arr[j])) {
                        swap(j - 1, j);
                        entryWasSwapped = true;
                    }
                }

                if (!entryWasSwapped) break;
            }
        }

        public static void timed (int [] arr) {
            init(arr);

            startTime = System.currentTimeMillis();
            run();
            endTime = System.currentTimeMillis();
        }
    }



    class QuickSort extends Algorithm {
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

        public static void timed (int [] arr) {
            init(arr);

            startTime = System.currentTimeMillis();
            run(0, arr.length - 1);
            endTime = System.currentTimeMillis();
        }
    }   
}