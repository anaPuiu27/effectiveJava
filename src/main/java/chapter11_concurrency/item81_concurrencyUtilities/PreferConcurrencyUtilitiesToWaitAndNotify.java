package chapter11_concurrency.item81_concurrencyUtilities;


public class PreferConcurrencyUtilitiesToWaitAndNotify {

    //use ConcurrentHashMap in preference to Collections.synchronizedMap
    //For interval timing, always use System.nanoTime rather than System.currentTimeMillis
    //Always use the wait loop idiom to invoke the wait method; never invoke it outside of a loop
}
