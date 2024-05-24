import java.lang.reflect.Method;

@FunctionalInterface 
interface lambda {
    void run(int[] arr, Method method, Algorithm classInstance);
}

//TODO: Look into this as an idea
//      Would help with making sure algorithm method gets used properly 
class Algorithsm {
    @FunctionalInterface 
    interface lambda {
        void run(int[] arr, Method method, Algorithm classInstance);
    }

    abstract class algorithm {
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

        abstract void swap();
        abstract boolean check();
        abstract void method();
        
        void methodCaller(int[] arr) {
            runningAlgorithm(null, "method");
        }
        void runningAlgorithm(int [] arr, String methodName) {
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
    }  

    class Bubblesort extends algorithm {
        void method() {
            //TODO: Remove
            for (int i = 0; i < 10; i++);
        }

        @Override
        void swap() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'swap'");
        }

        @Override
        boolean check() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'check'");
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
