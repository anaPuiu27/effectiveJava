package chapter10_exceptions.item73_appropriateExceptions;

public class ThrowExceptionsAppropriateToTheAbstraction {

    public static void main(String[] args) {
        //exception translation = higher layers should catch lower-level exceptions and, in their place, throw
        //exceptions that can be explained in terms of the higher-level abstraction
        //exception chaining -> pass over the cause

        //While exception translation is superior to mindless propagation of
        //exceptions from lower layers, it should not be overused

        /** {@link java.util.AbstractSequentialList#get(int)} */
    }
}
