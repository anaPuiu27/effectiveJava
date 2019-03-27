package chapter4_classesAndInterfaces.item17_mutability.demo;

public class ImmutableViaFactory {

    public static Immutable ONE = new Immutable(1);
    public static Immutable TEN = new Immutable(10);

    //final + private
    private final int v1;

    public ImmutableViaFactory(int v1) {
        this.v1 = v1;
    }

    public static ImmutableViaFactory valueOf(int val) {
        //can add mere multiple implementations based on performance or whatever
        return new ImmutableViaFactory(val);
    }
}
