package chapter4_classesAndInterfaces.item23_taggedClasses.demo;

public class PS4 extends Platform {

    private int psAccountValue;
    private int psSubscription;

    public PS4(int hardwareValue, int psAccountValue, int psSubscription) {
        super(hardwareValue);
        this.psAccountValue = psAccountValue;
        this.psSubscription = psSubscription;
    }

    @Override
    public int getValue() {
        return psAccountValue + psSubscription + hardwareValue;
    }
}
