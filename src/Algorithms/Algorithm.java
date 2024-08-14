package Algorithms;

import java.util.Arrays;

public abstract class Algorithm {
    int[] arr;
    int check, swap;
    long startTime, endTime;
e
    public abstract void run();

    void swap (int posA, int posB) {
        swap++;
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
    
    
    void init (int [] newArr) {
        arr = newArr;
        check = swap = 0;
    }
    
    boolean check (int a, int b) {
        check++;
        return a > b;
    }
 
    void printArray() {
        Arrays.toString(arr);
    }

    void timedSort() {
        init(arr);

        startTime = System.currentTimeMillis();
        run();
        endTime = System.currentTimeMillis();       
    }
}