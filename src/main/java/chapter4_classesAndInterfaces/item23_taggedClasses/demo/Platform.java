package chapter4_classesAndInterfaces.item23_taggedClasses.demo;

public abstract class Platform {

    protected int hardwareValue;

    protected Platform(int hardwareValue) {
        this.hardwareValue = hardwareValue;
    }

    public abstract int getValue();

}
