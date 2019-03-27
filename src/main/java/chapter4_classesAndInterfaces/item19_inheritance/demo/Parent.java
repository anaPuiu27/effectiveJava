package chapter4_classesAndInterfaces.item19_inheritance.demo;

public class Parent {

    public Parent(){

        canBeOverridden1();
        canBeOverridden2();

    }

    public void canBeOverridden1(){

        System.out.println("Message");
    }

    public void canBeOverridden2(){

        System.out.println("Message");
    }
}
