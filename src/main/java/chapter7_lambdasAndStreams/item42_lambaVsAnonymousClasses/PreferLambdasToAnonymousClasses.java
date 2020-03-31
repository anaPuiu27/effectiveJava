package chapter7_lambdasAndStreams.item42_lambaVsAnonymousClasses;

import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PreferLambdasToAnonymousClasses {

    //you should rarely, if ever, serialize a lambda or an anonymous class instance

    // this in lambda -> the enclosing instance
    // this in anonymous class -> the anonymous class

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        Collections.sort(words, comparingInt(String::length));

        words.sort(comparingInt(String::length));
    }
}
