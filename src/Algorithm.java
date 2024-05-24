import java.lang.reflect.Method;

@FunctionalInterface 
interface lambda {
    void run(int[] arr, Method method, Algorithm classInstance);
}

/*
//TODO: Look into this as an idea
//      Would help with making sure algorithm method gets used properly 
class Algorithsm {
    abstract class algorithm {
        abstract void method();
        abstract void methodCaller();
    }  

    class bubblesort extends algorithm {
        void method() {

        }

        void methodCaller () {

        }
    }
}
*/


public class Algorithm {
    static int count, swap;
    static long startTime, endTime;

    static lambda timer = (arr, method, classInstance) -> {
        try {
            long startTime = System.currentTimeMillis();
            method.invoke(classInstance, arr);
            long endTime = System.currentTimeMillis();
        } catch (Exception e) {
            e.getStackTrace();
        }
    };
    
    private static void runningAlgorithm(int [] arr, String methodName) {
        try {
            //Initialize variable
            count = swap = 0;

            Class[] parameterTypes = new Class[1];
            parameterTypes[0] = int[].class;
            Method methodToPass = Algorithm.class.getMethod(methodName, parameterTypes);
            Algorithm algorithm = new Algorithm();

            //TODO: Get rid of debug print statements
            timer.run(arr, methodToPass, algorithm);
            System.out.println("Start: " + startTime);
            System.out.println("End: " + endTime);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private boolean check (int a, int b) {
        //TODO
        return true;
    }

    private void swap (Object a, Object b) {
        //TODO
    }


    private void bubblesortAlgorithm(int[] arr) {
        //TODO
        for (int i = 0; i < 10; i++);
    }
    public static void bubblesort(int[] arr) {
        runningAlgorithm(arr, "bubblesortAlgorithm");
    }
}
