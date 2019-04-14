package chapter10_exceptions.item74_documentation;

public class DocumentAllExceptionsThrownByEachMethod {

    public static void main(String[] args) {
        //Always declare checked exceptions individually, and document precisely the conditions under which each one is thrown
        //do not use @throws on unchecked exceptions
        //If an exception is thrown by many methods in a class for the same reason,
        //you can document the exception in the class’s documentation comment
    }
}
