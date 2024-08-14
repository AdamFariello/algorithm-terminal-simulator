package Algorithms;

public class BubbleSort extends Algorithm {
    public static void test() {
        System.out.println("Works");
    }

    public static void run() {
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
    public static void runOptimized() {
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

    public void timed (int [] arr) {
        init(arr);

        startTime = System.currentTimeMillis();
        run();
        endTime = System.currentTimeMillis();
    }
}