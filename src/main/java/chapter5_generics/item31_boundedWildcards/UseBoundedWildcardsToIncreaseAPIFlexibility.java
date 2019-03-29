package chapter5_generics.item31_boundedWildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

public class UseBoundedWildcardsToIncreaseAPIFlexibility {

    public static void main(String[] args) {

        //producer - extends
        //consumer - super
        //all comparables and comparators are consumers
        //Do not use bounded wildcard types as return types
        //if a type parameter appears only once in a method declaration, replace it with a wildcard.

        List<ScheduledFuture<?>> scheduledFutures = new ArrayList<>();
        //max1(scheduledFutures); //-> compile error
        max2(scheduledFutures);

    }

    public static <E> Set<E> union1(Set<E> s1, Set<E> s2){
        return null;
    }
    public static <E> Set<E> union2(Set<? extends E> s1, Set<? extends E> s2){
        return null;
    }

    public static <T extends Comparable<T>> T max1(List<T> list){ return null;}
    public static <T extends Comparable<? super T>> T max2(List<? extends T> list){ return null;}


    public static <E> void swap1(List<E> list, int i, int j){}
    public static     void swap2(List<?> list, int i, int j){
        //list.set(i, list.set(j, list.get(i))); // compile error
    }
    public static     void swap3(List<?> list, int i, int j){
        swapHelper(list, i, j);
    }
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

}
