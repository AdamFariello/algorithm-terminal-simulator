import java.lang.reflect.Method;

@FunctionalInterface 
interface lambda {
    void timer(int[] arr, Method m);
}


public class Algorithm {
    int count, swap;
    long startTime, endTime;

    
    private void runningAlgorithm(int [] arr, String methodName) {
        try {
            //Initialize variable
            count = swap = 0;

            Class[] parameterTypes = new Class[1];
            parameterTypes[0] = int[].class;
            Method functionToPass = Algorithm.class.getMethod(methodName, parameterTypes);

            Algorithm algorithm = new Algorithm();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    private void timeAlgorithm () {
        long startTime = System.currentTimeMillis();
        //doReallyLongThing();
        long endTime = System.currentTimeMillis();
    }


    private boolean check (int a, int b) {
        


        return true;
    }

    private void swap (Object a, Object b) {

    }


    static public void bubblesort(int[] arr) {

    }
}
