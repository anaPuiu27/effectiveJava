package chapter3_methodsCommonToAllObjects.item12_toString.tostring;

import java.util.HashMap;
import java.util.Map;

public class MapWrapper {

    private Map<String, String> map = new HashMap<>();

    public void add(String key, String val) {

        map.put(key, val);
    }

    public String toString2() {
        return "MapWrapper{" +
                "map=" + map +
                '}';
    }
}
