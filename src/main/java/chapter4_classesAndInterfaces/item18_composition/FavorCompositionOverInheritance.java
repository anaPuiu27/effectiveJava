package chapter4_classesAndInterfaces.item18_composition;

import chapter4_classesAndInterfaces.item18_composition.demo.InstrumentedHashSet;
import chapter4_classesAndInterfaces.item18_composition.demo.SetWrapperWithForwarding;
import chapter4_classesAndInterfaces.item18_composition.demo.SetWrapperWithouForwarding;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class FavorCompositionOverInheritance {

    public static void main(String[] args) {

        //cons of inheritance
        //->violates encapsulation
        //->not easy to maintain
        //->fragile

        //cons of composition
        //->not suitable to use in callback frameworks: wrapped object doesn't know about it's wrapper = SELF problem
        //

        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("Snap", "Crackle", "Pop"));

        //6, not 3
        System.out.println(s.getAddCount());

        //wrapper - decorator - delegation
        SetWrapperWithForwarding withForwarding = new SetWrapperWithForwarding(Set.of("element"));

        //ForwardingSet - reusability
        SetWrapperWithouForwarding withoutForwarding = new SetWrapperWithouForwarding(Set.of("element"));

        //->use inheritance only when B is really a subtype of A
        // BAD
        Vector<String> stack = new Stack<>();
    }
}
