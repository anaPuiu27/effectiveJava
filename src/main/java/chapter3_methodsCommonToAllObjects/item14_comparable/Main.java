package chapter3_methodsCommonToAllObjects.item14_comparable;

import chapter3_methodsCommonToAllObjects.item14_comparable.comparable.PhoneNumber;

public class Main {

    public static void main(String[] args) {


        PhoneNumber v1 = new PhoneNumber(3, 3, 4);
        PhoneNumber v2 = new PhoneNumber(3, 7, 4);

        System.out.println(v1.compareToWithComparator(v2)); //-1
        System.out.println(v1.compareToOld(v2));            //-1
    }
}
