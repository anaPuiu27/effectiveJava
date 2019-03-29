package chapter4_classesAndInterfaces.item24_staticMembers;

import chapter4_classesAndInterfaces.item24_staticMembers.demo.*;

public class FavorStaticMembersOverNonStatic {

    public static void main(String[] args) {

        int i = new StaticMemberClass().negate();
        int j = new NonStaticMemberClass().negate();
        int k = new LocalClass().negate();
        int l = new InnerClass().negate();
        int m = new Lambda().negate();
    }
}
