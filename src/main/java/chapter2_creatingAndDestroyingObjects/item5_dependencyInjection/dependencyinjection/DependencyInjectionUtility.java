package chapter2_creatingAndDestroyingObjects.item5_dependencyInjection.dependencyinjection;

import chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility.SingletonUtils;

public class DependencyInjectionUtility {

    private static SingletonUtils utils;

    public DependencyInjectionUtility(SingletonUtils utils) {
        this.utils = utils;
    }

    public void validate() {
        utils.doThings2();
    }
}
