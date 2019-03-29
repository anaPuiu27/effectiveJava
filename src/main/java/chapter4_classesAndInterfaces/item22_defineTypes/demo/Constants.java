package chapter4_classesAndInterfaces.item22_defineTypes.demo;

public enum Constants {

    CONSTANT_1("C1"),
    CONSTANT_2("C2"),
    CONSTANT_3("C3");

    private final String value;

    Constants(String c) {
        this.value = c;
    }

    public String getValue() {
        return value;
    }
}
