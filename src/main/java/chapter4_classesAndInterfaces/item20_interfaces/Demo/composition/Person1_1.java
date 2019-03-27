package chapter4_classesAndInterfaces.item20_interfaces.Demo.composition;

public class Person1_1 {

    private Singer singer;
    private Walker walker;

    public void walks() {
        walker.walk();
    }

    public void sings() {
        singer.sing();
    }
}
