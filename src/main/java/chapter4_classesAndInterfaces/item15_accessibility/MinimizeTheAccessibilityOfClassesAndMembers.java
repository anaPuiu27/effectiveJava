package chapter4_classesAndInterfaces.item15_accessibility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimizeTheAccessibilityOfClassesAndMembers {

    public static void main(String[] args) {

        //encapsulation
        //decoupling

        //make each class or member as inaccessible as possible
        //instance fields of public classes should rarely be public
        //classes with public mutable fields are not generally thread-safe
        //it is wrong for a class to have a public static final array field, or an accessor that returns such a field
        //ensure that constants are immutable

        //java 9
        //module is a grouping of packages
        //a module may explicitly export some of its packages via export declarations in its module declaration
        //Public and protected members of unexported packages in a module are inaccessible outside the module
    }

    //Potential security hole!
    public static final String[] V1 = {"val"};

    private static final String[] PRIVATE_V2 = {"val"};
    public static final List<String> PUBLIC_V2 =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_V2));

    public static String[] getV1() {
        return V1.clone();
    }

}
