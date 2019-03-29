package chapter4_classesAndInterfaces.item24_staticMembers.demo;

public class NonStaticMemberClass {

    private int value;

    public int negate(){
        return new MemberClass().negate();
    }

    private class MemberClass{

        private static final int OPERATOR = -1;

        private int negate(){
            return OPERATOR * value;
        }
    }
}
