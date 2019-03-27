package chapter4_classesAndInterfaces.item16_accessors;

public class InPublicClassesUseAccessorMethodsNotPublicFields {

    public static void main(String[] args) {

        //if a class is accessible outside its package, provide accessor methods
        //if a class is package-private or is a private nested class, there is nothing inherently wrong with exposing its data fields

        PrivateClass packagePrivate = new PrivateClass();
        packagePrivate.field = "";

        PublicClass publicClass = new PublicClass();
        publicClass.getField();

        PublicWithIssue issue = new PublicWithIssue(5);
        System.out.println(issue.hour);
    }
}
