package chapter6_enumsAndAnnotations.item37_enumMap;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

class Plant {

    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        List<Plant> garden = List.of(new Plant("p1", LifeCycle.BIENNIAL), new Plant("p2", LifeCycle.ANNUAL));

        //v1
        // Using ordinal() to index into an array - DON'T DO THIS!
        Set<Plant>[] plantsByLifeCycleArray = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
        for (int i = 0; i < plantsByLifeCycleArray.length; i++)
            plantsByLifeCycleArray[i] = new HashSet<>();
        for (Plant p : garden)
            plantsByLifeCycleArray[p.lifeCycle.ordinal()].add(p);
        // Print the results
        System.out.println("----> v1");
        for (int i = 0; i < plantsByLifeCycleArray.length; i++) {
            System.out.printf("%s: %s%n",
                    Plant.LifeCycle.values()[i], plantsByLifeCycleArray[i]);
        }

        //v2
        // Using an EnumMap to associate data with an enum
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());
        for (Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);

        System.out.println("----> v2");
        System.out.println(plantsByLifeCycle);

        //v3
        // Naive stream-based approach - unlikely to produce an EnumMap!
        System.out.println("----> v3");
        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle)));

        //v4
        // Using a stream and an EnumMap to associate data with an enum
        System.out.println("----> v4");
        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), toSet())));
    }
}