package chapter4_classesAndInterfaces.item22_defineTypes;

import chapter4_classesAndInterfaces.item22_defineTypes.demo.ConstantClass;
import chapter4_classesAndInterfaces.item22_defineTypes.demo.ConstantInterface;
import chapter4_classesAndInterfaces.item22_defineTypes.demo.Constants;

public class UseInterfacesToDefineTypes {

    public static void main(String[] args) {

        /** {@link java.io.ObjectStreamConstants} */

        String s1 = ConstantInterface.CONSTANT_1;
        String s3 = ConstantClass.CONSTANT_1;
        String s2 = Constants.CONSTANT_1.getValue();
    }
}
