package chapter3_methodsCommonToAllObjects.item11_hashCode;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashCode.rules();
        noHashCode();

        Map<SameHashCode, String> sameHashKeyMap = new HashMap<>();
        Map<DifferentHashCode, String> differentHashKeyMap = new HashMap<>();

        for (int i = 0; i <= 1000; i++) {

            String string = RandomStringUtils.random(5);
            int areaCode = RandomUtils.nextInt();
            int prefix = RandomUtils.nextInt();
            int lineNum = RandomUtils.nextInt();

            sameHashKeyMap.put(new SameHashCode(areaCode, prefix, lineNum), string);
            differentHashKeyMap.put(new DifferentHashCode(areaCode, prefix, lineNum), string);
        }

        Random random = new Random();
        List<SameHashCode> keys = new ArrayList<>(sameHashKeyMap.keySet());
        SameHashCode randomKey = keys.get(random.nextInt(keys.size()));

        int areaCode = randomKey.getAreaCode();
        int prefix = randomKey.getPrefix();
        int lineNum = randomKey.getLineNum();

        long startTime = System.nanoTime();
        sameHashKeyMap.get(new SameHashCode(areaCode, prefix, lineNum));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        //95771
        System.out.println(duration);


        startTime = System.nanoTime();
        differentHashKeyMap.get(new DifferentHashCode(areaCode, prefix, lineNum));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        //7939
        System.out.println(duration);

    }

    private static void noHashCode() {
        Map<NoHashCode, String> map = new HashMap<>();
        map.put(new NoHashCode(707, 867, 5309), "Jenny");

        //null
        String retrieved = map.get(new NoHashCode(707, 867, 5309));
        System.out.println(retrieved);
    }
}
