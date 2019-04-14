package chapter10_exceptions.item72_useStandardExceptions;

public class FavorTheUseOfStandardExceptions {

    //Do not reuse Exception, RuntimeException, Throwable, or Error directly
    //exceptions are serializable -> reason not to write your own exception class without good reason

    /**
     *  {@link IllegalArgumentException}
     *  {@link IllegalStateException}
     *  {@link NullPointerException}
     *  {@link IndexOutOfBoundsException}
     *  {@link java.util.ConcurrentModificationException}
     *  {@link UnsupportedOperationException}
     */
}
