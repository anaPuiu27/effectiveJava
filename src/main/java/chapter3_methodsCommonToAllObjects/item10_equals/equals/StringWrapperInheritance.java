package chapter3_methodsCommonToAllObjects.item10_equals.equals;

public class StringWrapperInheritance extends StringWrapper {

    public String secondVal;

    public StringWrapperInheritance(String firstVal, String secondVal) {

        super(firstVal);
        this.secondVal = secondVal;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof StringWrapper)) {
            return false;
        }

        if (!(obj instanceof StringWrapperInheritance)) {
            return obj.equals(this);
        }

        if (obj instanceof StringWrapperInheritance) {
            return super.equals(obj) && secondVal.equalsIgnoreCase(((StringWrapperInheritance)obj).secondVal);
        }

        return true;
    }
}
