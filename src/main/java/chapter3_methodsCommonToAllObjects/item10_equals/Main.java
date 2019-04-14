package chapter3_methodsCommonToAllObjects.item10_equals;

import chapter3_methodsCommonToAllObjects.item10_equals.equals.OverrideEquals;
import chapter3_methodsCommonToAllObjects.item10_equals.equals.StringWrapper;
import chapter3_methodsCommonToAllObjects.item10_equals.equals.StringWrapperComposition;
import chapter3_methodsCommonToAllObjects.item10_equals.equals.StringWrapperInheritance;

public class Main {

    public static void main(String[] args) {

        OverrideEquals.no();
        OverrideEquals.yes();
        OverrideEquals.rules();

        // bad examples
        noSymmetry();
        noTransitivity();
        noConsistency();

        favorComposition();

    }

    private static void noSymmetry() {
        System.out.println("symmetry");

        StringWrapper v1 = new StringWrapper("firstName");
        String v2 = "firstname";

        System.out.println("\t" + v1.equals(v2)); //true
        System.out.println("\t" + v2.equals(v1)); //false
    }

    private static void noTransitivity() {
        System.out.println("Transitivity");

        StringWrapperInheritance e1 = new StringWrapperInheritance("firstName", "second name 1");
        StringWrapper e2 = new StringWrapper("firstName");
        StringWrapperInheritance e3 = new StringWrapperInheritance("firstName", "second name 2");

        System.out.println("\t" + e1.equals(e2)); //true
        System.out.println("\t" + e2.equals(e3)); //true
        System.out.println("\t" + e1.equals(e3)); //false
    }

    private static void noConsistency() {
        System.out.println("Consistency");

        StringWrapper v1 = new StringWrapper("firstName");
        StringWrapper v2 = new StringWrapper("firstName");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" + v1.equalsConsistency(v2));
        }

    }

    private static void favorComposition() {

        System.out.println("There is no way to extend an instantiable class and add a value component while preserving the equals contract");

        StringWrapperComposition v1 = new StringWrapperComposition(new StringWrapper("fiRst"), "second");
        StringWrapperComposition v2 = new StringWrapperComposition(new StringWrapper("first"), "seCond");

        System.out.println("\t" + v1.equals(v2));
    }


}
