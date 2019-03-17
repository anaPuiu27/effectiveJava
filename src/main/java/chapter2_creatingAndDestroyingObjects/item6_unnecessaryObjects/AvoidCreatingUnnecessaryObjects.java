package chapter2_creatingAndDestroyingObjects.item6_unnecessaryObjects;

public class AvoidCreatingUnnecessaryObjects {

    public static void main(String[] args) {

        //460421
        slow();

        //129830
        fast();

        //5546147622
        slow2();
        //534808406
        fast2();

        immutableObjectsCanAlwaysBeReused();
        mutableObjectsCanBeReusedIfTheyWontBeModified();
    }

    public static void slow() {

        long startTime = System.nanoTime();

        for (int i = 0; i <= 1000; i++) {
            Boolean b = new Boolean("true");
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);

    }

    public static void fast() {

        long startTime = System.nanoTime();

        for (int i = 0; i <= 1000; i++) {
            Boolean b = Boolean.valueOf("true");
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);

    }

    public static void slow2() {

        long startTime = System.nanoTime();

         Long sum = 0L;
         for(long i=0; i<Integer.MAX_VALUE; i++){
             sum += i;
         }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);

    }

    public static void fast2() {

        long startTime = System.nanoTime();

        long sum = 0L;
        for(long i=0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);

    }

    public static void immutableObjectsCanAlwaysBeReused(){}
    public static void mutableObjectsCanBeReusedIfTheyWontBeModified(){}

}


