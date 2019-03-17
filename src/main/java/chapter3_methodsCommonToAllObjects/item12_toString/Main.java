package chapter3_methodsCommonToAllObjects.item12_toString;

import chapter3_methodsCommonToAllObjects.item12_toString.tostring.MapWrapper;

import static org.apache.commons.lang3.RandomStringUtils.random;

public class Main {

    public static void main(String[] args) {

        //easy to debug
        MapWrapper mapWrapper = new MapWrapper();
        mapWrapper.add(random(5), random(6));
        mapWrapper.add(random(5), random(6));
        mapWrapper.add(random(5), random(6));
        mapWrapper.add(random(5), random(6));
        mapWrapper.add(random(5), random(6));

        System.out.println(mapWrapper.toString());
        System.out.println(mapWrapper.toString2());

    }
}
