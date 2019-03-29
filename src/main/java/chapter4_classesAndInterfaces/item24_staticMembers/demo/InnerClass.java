package chapter4_classesAndInterfaces.item24_staticMembers.demo;

public class InnerClass {

    private int value;

    public int negate() {

        return new Interface() {

            @Override
            public int negate() {
                return OPERATOR * value;
            }
        }.negate();
    }

}
