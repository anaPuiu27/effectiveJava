package chapter4_classesAndInterfaces.item23_taggedClasses;

import chapter4_classesAndInterfaces.item23_taggedClasses.demo.PC;
import chapter4_classesAndInterfaces.item23_taggedClasses.demo.PS4;
import chapter4_classesAndInterfaces.item23_taggedClasses.demo.TaggedClass;

public class PreferHierarchiesToTaggedClasses {

    public static void main(String[] args) {

        TaggedClass tg1 = new TaggedClass(1,2,3);
        TaggedClass tg2 = new TaggedClass(1000,2000);

        PS4 ps4 = new PS4(1,2,3);
        PC pc = new PC(1000, 2000);
    }
}
