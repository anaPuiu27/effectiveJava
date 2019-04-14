package chapter6_enumsAndAnnotations.item35_instanceFields;

public class UseInstanceFieldsInsteadOfOrdinals {


    public static void main(String[] args) {

    }

    // Abuse of ordinal to derive an associated value - DON'T DO THIS
    public enum Ensemble {
        SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
        //0   1     2     3        4        5       6       7      8      9

        public int numberOfMusicians() {
            return ordinal() + 1;
        }
    }

    public enum Ensemble2 {
        SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
        SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
        NONET(9), DECTET(10), TRIPLE_QUARTET(12);

        private final int numberOfMusicians;

        Ensemble2(int size) {
            this.numberOfMusicians = size;
        }

        public int numberOfMusicians() {
            return numberOfMusicians;
        }
    }
}
