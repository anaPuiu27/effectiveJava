package chapter5_generics.item27_uncheckedWarnings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EliminateUncheckedWarnings {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet();
        Set<String> set2 = new HashSet<>();
    }

    public <T> T[] toArray1(T[] a) {
        int size = 5;
        Object[] elements = {};

        if (a.length < size)
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    public <T> T[] toArray2(T[] a) {
        int size = 5;
        Object[] elements = {};

        if (a.length < size) {
            //why this is safe
            @SuppressWarnings("unchecked")
            T[] copy = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return copy;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
}
