package chapter3_methodsCommonToAllObjects.item13_clone.clone;

public class Clone {

    public static void rules() {

        System.out.println("Rules");

        System.out.println("\t"+"If a class implements Cloneable, Object’s clone method returns a field-by field " +
                "copy of the object; otherwise it throws CloneNotSupportedException");
        System.out.println("Immutable classes should never provide a clone method");
    }
}
