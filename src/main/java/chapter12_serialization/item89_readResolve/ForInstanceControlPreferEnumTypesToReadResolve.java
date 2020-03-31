package chapter12_serialization.item89_readResolve;

public class ForInstanceControlPreferEnumTypesToReadResolve {

    //if you depend on readResolve for instance control, all instance fields with object reference types must be declared transient

    public static final ForInstanceControlPreferEnumTypesToReadResolve INSTANCE = new ForInstanceControlPreferEnumTypesToReadResolve();

    private ForInstanceControlPreferEnumTypesToReadResolve() {
        //do something
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
