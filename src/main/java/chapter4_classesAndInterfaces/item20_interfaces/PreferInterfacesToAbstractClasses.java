package chapter4_classesAndInterfaces.item20_interfaces;

import chapter4_classesAndInterfaces.item20_interfaces.demo.simulate.SingerWriterImpl;

public class PreferInterfacesToAbstractClasses {

    public static void main(String[] args) {

        //easier to retrofit to implement a new interface than a new abstract class
        //interfaces are ideal for defining mixins

        //template method -> interface -> abstract skeleton implementation -> inheritance
        /**{@link java.util.Collection} -> {@link java.util.AbstractCollection} -> {@link java.util.AbstractList} -> {@link java.util.ArrayList}*/

        //simulated multiple inheritance
        SingerWriterImpl singerWriter = new SingerWriterImpl();
    }
}
