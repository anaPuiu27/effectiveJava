package chapter2_creatingAndDestroyingObjects.item4_noninstantiability;

import chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility.SingletonUtils;
import chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("chapter2_creatingAndDestroyingObjects.item4_noninstantiability.utility")
@Configuration
public class NonInsatiabilityWithPrivateConstructor {

    @Autowired
    private static SingletonUtils singletonUtils;

    public static void main(String[] args) {

        //hard to mock for testing
        Utils.doThings1();

        //easy to mock for testing
        singletonUtils.doThings1();
    }
}
