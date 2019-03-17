package chapter3_methodsCommonToAllObjects.item14_comparable.comparable;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class PhoneNumber implements Comparable {

    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    private final Integer areaCode;
    private final Integer prefix;
    private final Integer lineNum;

    public PhoneNumber(Integer areaCode, Integer prefix, Integer lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode &&
                prefix == that.prefix &&
                lineNum == that.lineNum;
    }

    public int compareToOld(PhoneNumber pn) {
        int result = Integer.compare(areaCode, pn.areaCode);
        if (result == 0) {
            result = Integer.compare(prefix, pn.prefix);
            if (result == 0)
                result = Integer.compare(lineNum, pn.lineNum);
        }
        return result;
    }

    public int compareToWithComparator(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
