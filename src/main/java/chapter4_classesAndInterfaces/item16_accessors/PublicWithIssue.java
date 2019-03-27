package chapter4_classesAndInterfaces.item16_accessors;

public class PublicWithIssue {

    public final int hour;

    public PublicWithIssue(int hour) {

        if(hour > 24 ){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
    }
}
