package chapter4_classesAndInterfaces.item24_staticMembers.demo;

public class StaticMemberClass {

    private int value;

    public int negate(){
        return MemberClass.getNegationOperator() * value;
    }

    private static class MemberClass{

        private static final int OPERATOR = -1;

        private static int getNegationOperator(){
            return OPERATOR;
        }
    }
}
