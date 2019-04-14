package chapter3_methodsCommonToAllObjects.item10_equals.equals;

public class StringWrapperComposition {

    private StringWrapper stringWrapper;
    private String secondValue;

    public StringWrapperComposition(StringWrapper stringWrapper, String secondValue) {
        this.stringWrapper = stringWrapper;
        this.secondValue = secondValue;
    }

    public StringWrapper getStringWrapper() {
        return stringWrapper;
    }

    public void setStringWrapper(StringWrapper stringWrapper) {
        this.stringWrapper = stringWrapper;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof StringWrapperComposition)) {
            return false;
        }

        StringWrapperComposition obj = (StringWrapperComposition) o;

        return obj.stringWrapper.equals(stringWrapper) && obj.secondValue.equalsIgnoreCase(secondValue);

    }

}
