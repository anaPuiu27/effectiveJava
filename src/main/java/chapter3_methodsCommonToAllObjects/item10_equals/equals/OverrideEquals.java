package chapter3_methodsCommonToAllObjects.item10_equals.equals;

public class OverrideEquals {

    public static void no() {

        System.out.println("Do not override equals if");

        System.out.println("\t Each instance of the class is inherently unique");
        System.out.println("\t There is no need for the class to provide a “logical equality” test.");
        System.out.println("\t A superclass has already overridden equals, and the superclass behavior is appropriate for this class.");
        System.out.println("\t The class is private or package-private, and you are certain that its equals method will never be invoked");
        System.out.println("\t A class that uses instance control; ex: singleton, enums");
    }

    public static void yes(){

        System.out.println("Override equals for");

        System.out.println("\t A class has a notion of logical equality that differs from mere object identity and a superclass has not already overridden equals ");
        System.out.println("\t Value classes");
    }

    public static void rules(){

        System.out.println("Rules");

        System.out.println("\tReflexive");
        System.out.println("\tSymmetric");
        System.out.println("\tTransitive");
        System.out.println("\tConsistent");
        System.out.println("\tNull safe");

    }
}
