package chapter4_classesAndInterfaces.item19_inheritance.demo;

public class Child extends Parent {

    private final String CONSTANT1 = "";
    private final String CONSTANT2;

    public Child() {
        CONSTANT2 = "CONSTANT";
    }

    @Override
    public void canBeOverridden1() {
        System.out.println("New message - Member Field" + CONSTANT1.toLowerCase());
    }

    @Override
    public void canBeOverridden2() {
        System.out.println("New message - Constructor Field" + CONSTANT2.toLowerCase());
    }
}
