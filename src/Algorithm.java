import java.lang.reflect.Method;


public class Algorithm {
    static int count, swap;
    static long startTime, endTime;

    private static void runningAlgorithm(int [] arr, String methodName) {
        try {
            //Initialize variable
            count = swap = 0;
            //getMethod only gets public methods
            Method method = Algorithm.class.getDeclaredMethod(methodName, int[].class);
            Algorithm algorithm = new Algorithm();

            startTime = System.currentTimeMillis();
            method.invoke(algorithm, arr);
            endTime = System.currentTimeMillis();

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
        //runningAlgorithm(arr, "bubblesortAlgorithm");
        runningAlgorithm(null, "bubblesortAlgorithm");
    }
}
