package chapter2_creatingAndDestroyingObjects.item3_singleton;

import chapter2_creatingAndDestroyingObjects.item3_singleton.singleton.SingletonByEnum;
import chapter2_creatingAndDestroyingObjects.item3_singleton.singleton.SingletonByFactoryMethod;
import chapter2_creatingAndDestroyingObjects.item3_singleton.singleton.SingletonByPrivateField;

public class SingletonWithPrivateConstructorOrEnumType {

    public static void main(String[] args) {

        SingletonByPrivateField singleton1 = SingletonByPrivateField.INSTANCE;

        //simpler and more clear that it is a SINGLETON
        //you can make the class not singleton without modifying the API
        //can be used as supplier
        SingletonByFactoryMethod singleton2 = SingletonByFactoryMethod.getInstance();

        //doesn't work if inheritance in needed
        SingletonByEnum singleton3 = SingletonByEnum.INSTANCE;

    }
}
