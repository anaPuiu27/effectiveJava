package chapter7_lambdasAndStreams.item43_methodReferenceVsLambda;

import java.util.HashMap;
import java.util.Map;

public class PreferMethodReferencesToLambdas {

    //where method references are shorter and clearer, use them
    //where they aren’t, stick with lambdas

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        String key = "key";

        map.merge(key, 1, (count, incr) -> count + incr);

        map.merge(key, 1, Integer::sum);
    }
}
