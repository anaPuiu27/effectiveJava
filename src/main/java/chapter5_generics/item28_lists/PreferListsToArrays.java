package chapter5_generics.item28_lists;

import chapter5_generics.item28_lists.demo.*;

import java.util.List;

public class PreferListsToArrays {

    public static void main(String[] args) {

        //covariance - Sub[] is a subtype of Super[]

        Super[] parent = new Sub[2];
        parent[1] = new Super(); // -> array store exception at runtime

        //List<Super> parentList = new ArrayList<Sub>(); // -> compilation error

        //reified -> arrays know and enforce their element type at runtime
        //erasure -> generics enforce their type constraints only at compile time and discard (or erase) their element type information at runtime for compatibility

        //List<String>[] stringLists = new List<String>[1];
        //List<Integer> intList = List.of(42);
        //Object[] objects = stringLists;
        //objects[0] = intList;
        //String s = stringLists[0].get(0);

        List<?>[] stringLists = new List<?>[1];
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        Object o = stringLists[0].get(0);

        Chooser chooser1 = new Chooser(intList);
        Integer result = (Integer) chooser1.choose();

        Chooser2 chooser2 = new Chooser2(intList);
        Integer result2 = (Integer) chooser2.choose();

        Chooser3<Integer> chooser3 = new Chooser3<>(intList);
        Integer result3 = chooser3.choose();

    }
}
