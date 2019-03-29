package chapter4_classesAndInterfaces.item23_taggedClasses.demo;

public class PC extends Platform {

    private int steamAccountValue;

    public PC(int hardwareValue, int steamAccountValue) {
        super(hardwareValue);
        this.steamAccountValue = steamAccountValue;
    }

    @Override
    public int getValue() {
       return steamAccountValue + hardwareValue;
    }
}
