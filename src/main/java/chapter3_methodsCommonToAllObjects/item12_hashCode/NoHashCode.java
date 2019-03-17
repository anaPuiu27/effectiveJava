package chapter3_methodsCommonToAllObjects.item12_hashCode;

public class NoHashCode {

    private final int areaCode;
    private final int prefix;
    private final int lineNum;

    public NoHashCode(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoHashCode that = (NoHashCode) o;
        return areaCode == that.areaCode &&
                prefix == that.prefix &&
                lineNum == that.lineNum;
    }
}
