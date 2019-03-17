package chapter3_methodsCommonToAllObjects.item13_clone.clone;

import java.util.ArrayList;
import java.util.List;

public class CloneableItem implements Cloneable {

    public int val;
    public List<String> list;
    public String[] array;

    public CloneableItem(int val, List<String> list, String[] array) {

        this.val = val;
        this.list = list;
        this.array = array;
    }

    public CloneableItem(CloneableItem cloneableItem) {

        List<String> listClone = new ArrayList<>(cloneableItem.list);

        this.val = cloneableItem.val;
        this.list = listClone;
        this.array = cloneableItem.array.clone();
    }

    public static CloneableItem newInstance(CloneableItem cloneableItem) {
        List<String> listClone = new ArrayList<>(cloneableItem.list);

        return new CloneableItem(cloneableItem.val, listClone, cloneableItem.array.clone());
    }

    @Override
    //covariant return type
    public CloneableItem clone() {
        try {
            return (CloneableItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    public CloneableItem deepClone() {

        List<String> listClone = new ArrayList<>(list);

        CloneableItem item = new CloneableItem(val, listClone, array.clone());
        return item;
    }
}
