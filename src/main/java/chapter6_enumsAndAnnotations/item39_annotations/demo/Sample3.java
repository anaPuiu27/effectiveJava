package chapter6_enumsAndAnnotations.item39_annotations.demo;

public class Sample3 {

    // Code containing a repeated annotation
    @ExceptionTestRepeatable(IndexOutOfBoundsException.class)
    @ExceptionTestRepeatable(NullPointerException.class)
    public static void doublyBad() { /* ... */}

    @ExceptionTestRepeatable(IndexOutOfBoundsException.class)
    @ExceptionTestRepeatable(NullPointerException.class)
    public static void doublyBad2() {
        throw new NullPointerException();
    }

    @ExceptionTestRepeatable(IndexOutOfBoundsException.class)
    @ExceptionTestRepeatable(NullPointerException.class)
    public static void doublyBad3() {
        throw new IndexOutOfBoundsException();
    }
}
