package chapter6_enumsAndAnnotations.item40_override.demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bigram2 {

    private final char first;
    private final char second;

    public Bigram2(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigram2 bigram2 = (Bigram2) o;
        return first == bigram2.first &&
                second == bigram2.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static void main(String[] args) {
        Set<Bigram2> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram2(ch, ch));
        System.out.println(s.size());
    }
}
