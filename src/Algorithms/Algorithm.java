package Algorithms;

import java.util.Arrays;

public abstract class Algorithm {
    int[] arr;
    int check, swap;
    long startTime, endTime;


    void init (int [] arr) {
        this.arr = arr;
        check = swap = 0;
    }

    void swap (int posA, int posB) {
        swap++;
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
    
    boolean check (int a, int b) {
        check++;
        return a > b;
    }
 

    protected abstract void sort();
    public static void sort(int [] arr) {
        init(arr);
        sort();
    }
    public static void timedSort(int [] arr) {
        init(arr);

        startTime = System.currentTimeMillis();
        sort();
        endTime = System.currentTimeMillis();       
    }
}