package chapter4_classesAndInterfaces.item24_staticMembers.demo;

public class LocalClass {

    private int value;

    public int negate() {

        class InterfaceImpl implements Interface {

            @Override
            public int negate() {
                return OPERATOR * value;
            }
        }

        return new InterfaceImpl().negate();
    }
}
