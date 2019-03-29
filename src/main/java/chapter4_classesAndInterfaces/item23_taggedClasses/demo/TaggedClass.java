package chapter4_classesAndInterfaces.item23_taggedClasses.demo;

public class TaggedClass {

    enum Platform {PC, PS4}

    private Platform platform;

    private int steamAccountValue;

    private int psAccountValue;

    private int psSubscription;

    private int hardwareValue;

    public TaggedClass(int steamAccountValue, int hardwareValue) {
        this.platform = Platform.PC;
        this.steamAccountValue = steamAccountValue;
        this.hardwareValue = hardwareValue;
    }

    public TaggedClass(int psAccountValue, int psSubscription, int hardwareValue) {
        this.platform = Platform.PS4;
        this.psAccountValue = psAccountValue;
        this.psSubscription = psSubscription;
        this.hardwareValue = hardwareValue;
    }

    public int getValue() {
        switch (platform) {
            case PC:
                return steamAccountValue + hardwareValue;
            case PS4:
                return psAccountValue + psSubscription + hardwareValue;
        }
        return 0;
    }
}
