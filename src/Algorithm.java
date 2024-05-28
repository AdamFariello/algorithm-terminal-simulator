import java.lang.reflect.Method;

//TODO: Look into this as an idea
//      Would help with making sure algorithm method gets used properly 
class Algorithms {
    interface AlgorithmBluePrint {
        //void swap();
        //boolean check();
        
        //Where the algorithm is stored
        void run(); 
    }

    class Algorithm {
        final String algorithmFunctionName = "run"; 
        int count, swap;
        long startTime, endTime;
        

        protected void swap (int a, int b) {
            //TODO: Figure if this should be more generic
            int temp = a;
            a = b;
            b = temp;
        }
        protected boolean check (int a, int b) {
            //TODO: check if this function needs to be more generic
            return a > b;
        }

        public void timed(int[] arr) {
            try {
                //Initialize variable
                count = swap = 0;
                
                //getMethod only gets public methods
                Method method = Algorithm.class.getDeclaredMethod(algorithmFunctionName, int[].class);
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
    }  

    class Bubblesort extends Algorithm implements AlgorithmBluePrint {
        public void run() {
            //TODO: Remove Debug
            System.out.println("Bubblesort Algorithm");
        }
    }
}


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
        Algorithsm.bubblesort();
    }
}
