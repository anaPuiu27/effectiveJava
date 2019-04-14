package chapter10_exceptions.item69_exceptionalConditions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class UseExceptionsForExceptionalConditions {

    public static void main(String[] args) {

        //used only for exceptional conditions
        //A well-designed API must not force its clients to use exceptions for ordinary control flow
        // - 1
            /*state depending operation - */ /** {@link Iterator#next()}*/
            /*state testing method      - */ /** {@link Iterator#hasNext()} */
        // - 2
            // use optional

        String[] range = {"first"};
        // Horrible abuse of exceptions. Don't ever do this!
        try {
            int i = 0;
            while (true)
                System.out.println(range[i++]);
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        // iterator example
        Collection<String> collection = List.of("first");

        for (Iterator<String> i = collection.iterator(); i.hasNext(); ) {
            String foo = i.next();
        }

        // Do not use this hideous code for iteration over a collection!
        try {
            Iterator<String> i = collection.iterator();
            while (true) {
                String foo = i.next();
            }
        } catch (NoSuchElementException e) {
        }
    }


}
