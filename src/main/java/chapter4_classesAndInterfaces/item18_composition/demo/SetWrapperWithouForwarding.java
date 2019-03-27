package chapter4_classesAndInterfaces.item18_composition.demo;

import java.util.Collection;
import java.util.Set;

public class SetWrapperWithouForwarding<E> {

    private Set<E> set;

    private int addCount = 0;

    public SetWrapperWithouForwarding(Set<E> s) {
        this.set = s;
    }

    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
