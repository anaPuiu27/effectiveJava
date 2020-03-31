package chapter7_lambdasAndStreams.item46_sideEffectFunctionsInStreams;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class PreferSideEffectFreeFunctionsInStreams {

    //A pure function is one whose result depends only on its input: it does not depend on any mutable state, nor does it update any state
    //The forEach operation should be used only to report the result of a stream computation, not to perform the computation

    public PreferSideEffectFreeFunctionsInStreams() throws FileNotFoundException {

        // Uses the streams API but not the paradigm--Don't do this!

        Map<String, Long> freq = new HashMap<>();

        File file = new File("path");

        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }

        // Proper use of streams to initialize a frequency table
        Map<String, Long> freq2 = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq2 = words.collect(groupingBy(String::toLowerCase, counting()));
        }
    }
}
