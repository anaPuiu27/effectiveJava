package chapter4_classesAndInterfaces.item17_mutability.demo;

//no extension
public final class Immutable {

    public static Immutable ONE = new Immutable(1);
    public static Immutable TEN = new Immutable(10);

    //final + private
    private final int v1;

    public Immutable(int v1) {
        this.v1 = v1;
    }

    //exclusive access
    public Immutable plus(Immutable obj) {
        return new Immutable(v1 + obj.v1);
    }

    //no mutators
    public int getV1() {
        return v1;
    }

    public Immutable negate(){
        return new Immutable(-v1);
    }
}
