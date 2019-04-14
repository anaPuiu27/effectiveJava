package chapter6_enumsAndAnnotations.item38_extensibleEnums;

import chapter6_enumsAndAnnotations.item38_extensibleEnums.demo.BasicOperation;
import chapter6_enumsAndAnnotations.item38_extensibleEnums.demo.Operation;

import java.util.Collection;
import java.util.List;

public class EmulateExtensibleEnumsWithInterfaces {


    public static void main(String[] args) {

        //opcodes = enumerated type whose elements represent operations on some machine

        test(BasicOperation.class,2L,3L);
        test(List.of(BasicOperation.DIVIDE, BasicOperation.TIMES),2L,3L);
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
