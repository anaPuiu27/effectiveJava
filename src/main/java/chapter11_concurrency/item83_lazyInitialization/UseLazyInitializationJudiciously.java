package chapter11_concurrency.item83_lazyInitialization;

public class UseLazyInitializationJudiciously {

    //Under most circumstances, normal initialization is preferable to lazy initialization


    private static String computeFieldValue() {
        return "some string";
    }

    //If you use lazy initialization to break an initialization circularity, use a synchronized accessor
    private String field;

    private synchronized String getField() {

        if (field == null) {
            field = computeFieldValue();
        }
        return field;
    }

    //If you need to use lazy initialization for performance on a static field, use the lazy initialization holder class idiom
    static final String field2 = computeFieldValue();

    private static String getField2() {

        return UseLazyInitializationJudiciously.field2;
    }

    //If you need to use lazy initialization for performance on an instance field, use the double-check idiom
    private volatile String field3;

    private String getField3() {

        String result = field3;
        if (result == null) { // First check (no locking)
            synchronized (this) {
                if (field3 == null) { // Second check (with locking)
                    field3 = result = computeFieldValue();
                }
            }
        }

        return result;
    }

}
