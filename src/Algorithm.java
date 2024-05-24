import java.lang.reflect.Method;

//TODO: Look into this as an idea
//      Would help with making sure algorithm method gets used properly 
class Algorithsm {


    abstract class algorithm {
        static int count, swap;
        static long startTime, endTime;
    


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
}


public class Algorithm {

    abstract class base {
        static int count, swap;
        static long startTime, endTime;
    

        void swap() {

        }
        boolean check() {
            return false;
        }
        

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

    class Bubblesort extends base {
        void method(int[] arr) {
            //TODO
            for (int i = 0; i < 10; i++);
        }
    } 


    public static void bubblesort(int[] arr) {
        //runningAlgorithm(arr, "bubblesortAlgorithm");
        Bubblesort.methodCaller();
    }
}
