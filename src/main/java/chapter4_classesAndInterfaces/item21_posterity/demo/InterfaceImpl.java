package chapter4_classesAndInterfaces.item21_posterity.demo;

public class InterfaceImpl implements Interface {

    private String value;

    public InterfaceImpl(String value) {

        this.value = value;
    }

    @Override
    public void methodA() {

        System.out.println(value.toLowerCase());
    }

    @Override
    public void reset() {
        value = null;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
