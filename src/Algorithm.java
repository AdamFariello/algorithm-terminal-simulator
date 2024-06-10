import java.lang.reflect.Method;
import java.util.Arrays;

public class Algorithm {
    private class AlgorithmBase {
        final static  String algorithmFunctionName = "run"; 
        static int check, swap;
        static long startTime, endTime;
        static int [] arr;

        AlgorithmBase() {}

        private void init (int [] newarr) {
            arr = newarr;
            check = swap = 0;
        }
        protected void swap (int posA, int posB) {
            //TODO: Figure if this should be more generic        
            int temp = arr[posA];
            arr[posA] = arr[posB];
            arr[posB] = temp;
        }
        protected boolean check (int a, int b) {
            //TODO: Theorize how to make this more generic
            //      Unlikely, but would use instanceOf
            return a > b;
        }

        public void timed(int[] arr) {
            init(arr);
            
            try {
                Class currentClass = this.getClass();
                Class [] parameters = {int[].class};
                Method method = currentClass.getDeclaredMethod(algorithmFunctionName, parameters[0]);
                Object secondClass = currentClass.getDeclaredConstructor().newInstance();

                //Running the method
                startTime = System.currentTimeMillis();
                method.invoke(secondClass, arr);
                endTime = System.currentTimeMillis();

                //TODO: Get rid of debug print statements
                System.out.println("Start: " + startTime);
                System.out.println("End: " + endTime);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    class BubbleSort extends AlgorithmBase {
        public static void run(int [] arr) {
            try {
                //TODO: Remove Debug
                for (int i = 0; i < 100; i++);

                /* 
                int a = 1;
                int b = 2;
                System.out.println("Before the change: " + Arrays.toString(arr));
                swap(a,b);
                System.out.println("After the change: " + Arrays.toString(arr));
                */
            } catch (Exception e) {
                System.out.println(e);
                //e.getStackTrace();
            }
        }

        public static void sort (int [] arr) {
            AlgorithmBase algo = new AlgorithmBase();
            timed(arr);
        }
    }


    class QuickSort extends AlgorithmBase {
        public void run(int [] arr) {
            try {
                //TODO: Remove Debug
                for (int i = 0; i < 10; i++);
    
                int a = 1;
                int b = 2;
                System.out.println("Before the change: " + Arrays.toString(arr));
                swap(a,b);
                System.out.println("After the change: " + Arrays.toString(arr));
            } catch (Exception e) {
                System.out.println(e);
                //e.getStackTrace();
            }
        }

        public static void sort (int [] arr) {
            timed(arr);
        }
    }
}
