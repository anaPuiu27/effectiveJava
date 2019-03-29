package chapter5_generics.item26_rawTypes;

import chapter5_generics.item26_rawTypes.demo.Coin;
import chapter5_generics.item26_rawTypes.demo.Stamp;

import java.util.*;

public class DontUseRawTypes {

    public static void main(String[] args) {

        Collection stamps = new ArrayList();
        stamps.add(new Coin());

        for (Iterator i = stamps.iterator(); i.hasNext(); ) {
            //Stamp stamp = (Stamp) i.next();// -> cast exception
            i.next();
        }

        Collection<Stamp> stamps2 = new ArrayList();
        stamps2.add(new Stamp());
        //stamps2.add(new Coin()); -> compilation error

        // -------------------------------------------------------------------------------------------------------------

        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        //String s = strings.get(0); //-> cast exception

        //unsafeAdd2(strings, Integer.valueOf(42)); //-> wrong argument

        // -------------------------------------------------------------------------------------------------------------
        //generic type information is erased at runtime

        List<?> list = new ArrayList<>();
        list.add(null);
        //list.add("sd"); //-> compile error

        Set<String> set1 = Set.of("s1");
        Set<String> set2 = Set.of("s2");
        Set<Double> set3 = Set.of(Double.MIN_VALUE);

        numElementsInCommon(set1, set2);
        numElementsInCommon(set1, set3);

        numElementsInCommon2(set1, set2);
        //numElementsInCommon2(set1, set3); //-> error

        numElementsInCommon3(set1, set2);
        numElementsInCommon3(set1, set3);

        Class listClass = List.class;
        //listClass = List<String>.class; //-> error

        boolean b = set1 instanceof Set;
        //b = set1 instanceof Set<String>; //-> error

    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    private static void unsafeAdd2(List<Object> list, Object o) {
        list.add(o);
    }

    static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

    static <E> int numElementsInCommon2(Set<E> s1, Set<E> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

    static int numElementsInCommon3(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }
}
