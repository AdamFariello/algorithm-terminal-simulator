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
            startTime = System.currentTimeMillis();
            method.invoke(classInstance, arr);
            endTime = System.currentTimeMillis();
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
            Method methodToPass = Algorithm.class.getDeclaredMethod(methodName, parameterTypes);
            Algorithm algorithm = new Algorithm();

            //TODO: Get rid of debug print statements
            timer.run(arr, methodToPass, algorithm);
            System.out.println("Start: " + startTime);
            System.out.println("End: " + endTime);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    private static void runningAlgorithm2(int [] arr, String methodName) {
        try {
            //Initialize variable
            count = swap = 0;
            //getMethod only gets public methods
            Method method = Algorithm.class.getDeclaredMethod(methodName, int[].class);
            Algorithm algorithm = new Algorithm();

            System.out.println("Got to here");
            long startTime = System.currentTimeMillis();
            method.invoke(algorithm, arr);
            long endTime = System.currentTimeMillis();

            //TODO: Get rid of debug print statements
            System.out.println("Start: " + startTime);
            System.out.println("End: " + endTime);
        } catch (Exception e) {
            System.out.println(e);
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
