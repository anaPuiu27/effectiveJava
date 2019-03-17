package chapter2_creatingAndDestroyingObjects.item7_obsoleteReferences;

import chapter2_creatingAndDestroyingObjects.item7_obsoleteReferences.memoryleak.StackMemoryLeak;

import java.util.Arrays;

public class EliminateObsoleteReferences {

    public static void main(String[] args) {

        //define each variable in the narrowest possible scope
        //nulling out object references should be the exception rather than the norm

        StackMemoryLeak stack = new StackMemoryLeak();
        stack.push(Integer.MIN_VALUE);
        stack.popWithMemoryLeak();

        //true
        System.out.println(Arrays.asList(stack.getElements()).contains(Integer.MIN_VALUE));

        StackMemoryLeak stack2 = new StackMemoryLeak();
        stack2.push(Integer.MIN_VALUE);
        stack2.popWithoutMemoryLeak();

        //false
        System.out.println(Arrays.asList(stack2.getElements()).contains(Integer.MIN_VALUE));

    }


}
