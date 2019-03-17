package chapter2_creatingAndDestroyingObjects.item7_obsoleteReferences.memoryleak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMemoryLeak {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object popWithMemoryLeak() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    public Object popWithoutMemoryLeak() {
        if (size == 0)
            throw new EmptyStackException();

        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public Object[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }
}

