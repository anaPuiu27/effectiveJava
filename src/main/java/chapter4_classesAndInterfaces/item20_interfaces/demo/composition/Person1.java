package chapter4_classesAndInterfaces.item20_interfaces.demo.composition;

public class Person1 {

    private Singer singer;

    public void sings() {
        singer.sing();
    }
}
