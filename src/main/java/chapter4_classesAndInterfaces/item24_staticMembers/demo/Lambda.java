package chapter4_classesAndInterfaces.item24_staticMembers.demo;

public class Lambda {
    private int value;

    public int negate() {

        return ((Interface) () -> Interface.OPERATOR * value).negate();
    }

}
