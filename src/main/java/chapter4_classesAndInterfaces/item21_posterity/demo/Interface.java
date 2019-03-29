package chapter4_classesAndInterfaces.item21_posterity.demo;

public interface Interface {

    void methodA();

    void reset();

    default void tryAgain(){

        reset();
        methodA();
    }

}
