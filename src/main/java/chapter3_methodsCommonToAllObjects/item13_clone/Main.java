package chapter3_methodsCommonToAllObjects.item13_clone;

import chapter3_methodsCommonToAllObjects.item13_clone.clone.CloneableItem;

import java.util.ArrayList;
import java.util.List;

import static chapter3_methodsCommonToAllObjects.item13_clone.clone.Clone.rules;

public class Main {

    public static void main(String[] args) {

        rules();

        //

        List<String> list = new ArrayList();
        list.add("first");
        list.add("second");

        String[] array = new String[2];
        array[0] = "first";
        array[1] = "second";

        CloneableItem cloneable = new CloneableItem(5, list, array);
        CloneableItem cloned = cloneable.clone();

        cloneable.val = 8;
        cloneable.list.add("third");
        cloneable.array[1] = "new val";

        System.out.println(cloned.val == cloneable.val);//false
        System.out.println(cloned.list.size() == cloneable.list.size()); //true
        System.out.println(cloned.array[1].equals(cloneable.array[1])); //true

        // second try

        list = new ArrayList();
        list.add("first");
        list.add("second");

        array = new String[2];
        array[0] = "first";
        array[1] = "second";

        cloneable = new CloneableItem(5, list, array);
        cloned = cloneable.deepClone();

        cloneable.val = 8;
        cloneable.list.add("third");
        cloneable.array[1] = "new val";

        System.out.println(cloned.val == cloneable.val);//false
        System.out.println(cloned.list.size() == cloneable.list.size()); //false
        System.out.println(cloned.array[1].equals(cloneable.array[1])); //false

        //copy constructor
        cloned = new CloneableItem(cloneable);

        //copy factory
        cloned = CloneableItem.newInstance(cloneable);
    }
}
