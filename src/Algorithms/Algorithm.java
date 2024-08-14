package Algorithms;

public class Algorithm {
    static int[] arr;
    static int check, swap;
    static long startTime, endTime;


    protected static void init (int [] givenArr) {
        arr = givenArr;
        check = swap = 0;
    }

    protected static void swap (int posA, int posB) {
        swap++;
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
    
    protected static boolean check (int a, int b) {
        check++;
        return a > b;
    }    
}