package Algorithms;

public class BubbleSort extends Algorithm {
    private static void sort() {
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
    private static void optimizedSort() {
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


    public static int[] sort(int [] arr) {
        init(arr);
        sort();
        return arr;
    }
    public static int[] timedSort(int [] arr) {
        init(arr);

        startTime = System.currentTimeMillis();
        sort();
        endTime = System.currentTimeMillis();
        
        return arr;
    }


    public static int[] optimizedSort(int [] arr) {
        init(arr);
        optimizedSort();
        return arr;
    }
    public static int[] timedoptimizedSort(int [] arr) {
        init(arr);

        startTime = System.currentTimeMillis();
        optimizedSort();
        endTime = System.currentTimeMillis();
        
        return arr;
    }
}