package chapter10_exceptions.item76_failureAutomicity;

public class StriveForFailureAtomicity {

    public static void main(String[] args) {
        //a failed method invocation should leave the object in the state that it was in prior to the
        //invocation = failure-atomic

        //immutability
        //check for validity before execution

        //perform the operation on a temporary copy of the object and to replace the contents of the object with the
        //temporary copy once the operation is complete

        //write recovery code to do a rollback

        //may add complexity
    }
}
