package chapter4_classesAndInterfaces.item21_posterity;

import chapter4_classesAndInterfaces.item21_posterity.demo.InterfaceImpl;

public class DesignInterfacesForPosterity {

    public static void main(String[] args) {
        //not always possible to write a default method that maintains all invariants of every conceivable implementation
        //in the presence of default methods, existing implementations of an interface may compile without error or warning but fail at runtime

        InterfaceImpl impl =  new InterfaceImpl("324");

        impl.methodA();
        impl.tryAgain();
    }
}
