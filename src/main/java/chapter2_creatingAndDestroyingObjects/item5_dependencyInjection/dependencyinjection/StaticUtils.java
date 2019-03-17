package chapter2_creatingAndDestroyingObjects.item5_dependencyInjection.dependencyinjection;

import chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility.SingletonUtils;

public class StaticUtils {

private static SingletonUtils utils = new SingletonUtils();

private StaticUtils() {
}

public static void validate() {
    utils.doThings2();
}
}
