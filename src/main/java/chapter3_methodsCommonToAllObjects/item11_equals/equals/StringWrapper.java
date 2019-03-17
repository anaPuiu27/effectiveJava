package chapter3_methodsCommonToAllObjects.item11_equals.equals;

import java.util.Random;

public class StringWrapper {

    public String firstVal;

    public StringWrapper(String firstVal) {
        this.firstVal = firstVal;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof StringWrapper) {
            return ((StringWrapper) obj).firstVal.equalsIgnoreCase(this.firstVal);
        }

        if (obj instanceof String) {
            return this.firstVal.equalsIgnoreCase((String) obj);
        }

        return true;
    }

    public boolean equalsConsistency(StringWrapper o) {

        //exterior resource needed that may not have the same state in time
        int i = new Random().nextInt();

        if (i % 2 == 0)
            return false;

        return true;
    }
}
