package chapter2_creatingAndDestroyingObjects.item5_dependencyInjection;

import chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility.SingletonUtils;
import chapter2_creatingAndDestroyingObjects.item5_dependencyInjection.dependencyinjection.DependencyInjectionUtility;
import chapter2_creatingAndDestroyingObjects.item5_dependencyInjection.dependencyinjection.StaticUtils;

public class PreferDependencyInjection {

    public static void main(String[] args) {

        //pro
        DependencyInjectionUtility ok = new DependencyInjectionUtility(new SingletonUtils());
        ok.validate();

        //cons
        StaticUtils.validate();
    }
}

