package chapter5_generics.item31_boundedWildcards.demo;

import java.util.Collection;
import java.util.List;

public class Stack<E> {

    public Stack() {

    }

    public void push(E e) {

    }

    public E pop() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public void pushAll1(Iterable<E> src) {
        for (E e : src)
            push(e);
    }

    // produces -> it produces items on the stack
    public void pushAll2(Iterable<? extends  E> src) {
        for (E e : src)
            push(e);
    }

    public void popAll1(Collection<E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

    //consumer -> consumes instances from the stack
    public void popAll2(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

    public static void main(String[] args) {

        Stack<Number> numberStack = new Stack<>();

        Iterable<Number> numbers = List.of(42);
        numberStack.pushAll1(numbers);

        Iterable<Integer> integers = List.of(42);
        //numberStack.pushAll1(integers); //-> compile error

        numberStack.pushAll2(integers);
        numberStack.pushAll2(numbers);

        Collection<Object> objects = List.of(42);

        //numberStack.popAll1(objects); //-> compile error
        numberStack.popAll2(objects);

        //PECS: producer-extends consumer-super
    }
}
