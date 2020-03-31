package chapter11_concurrency.item84_threadScheduler;

public class DoNotDependOnTheThreadScheduler {

    //Any program that relies on the thread scheduler for correctness or performance is likely to be nonportable.
    //Threads should not run if they aren’t doing useful work
    //Thread priorities are among the least portable features of Java
}
