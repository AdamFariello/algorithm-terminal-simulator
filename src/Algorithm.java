import java.lang.reflect.Method;

//TODO: Look into this as an idea
//      Would help with making sure algorithm method gets used properly 

interface AlgorithmBluePrint {
    //TODO: Experiment with these being default methods
    //void swap();
    //boolean check();
    
    //Where the algorithm is stored
    abstract void run(); 
}

class AlgorithmBase {
    static final String algorithmFunctionName = "run"; 
    static int count, swap;
    static long startTime, endTime;

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
            Class currentClass = this.getClass();
            Class [] parameters = {int[].class};
            
            Method method = currentClass.getDeclaredMethod(algorithmFunctionName, parameters[0]);
            Object secondClass = currentClass.getDeclaredConstructor().newInstance();
            System.out.println("Class name: " + secondClass.toString());

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

class Bubblesort extends AlgorithmBase {
    public void run(int [] arr) {
        //TODO: Remove Debug
        for (int i = 0; i < 10; i++);
        System.out.println("Bubblesort Algorithm");
    }
}


public class Algorithm {
    static int count, swap;
    static long startTime, endTime;

    Algorithm() {}

    public void bubblesort(int[] arr) {
        Bubblesort test = new Bubblesort();
        test.timed(arr);
    }

    public void test() {
        System.out.println("The class name is: " + this.getClass().toString());
    }
}
