package chapter4_classesAndInterfaces.item19_inheritance;

import chapter4_classesAndInterfaces.item19_inheritance.demo.Child;

public class DesignAndImplementForInheritanceOrProhibitIt {

    public static void main(String[] args) {

        //the class must document its self-use of overridable methods -> non final, public/protected
        /**@implSpec -> {@link java.util.AbstractCollection#remove(Object)}*/

        //a class may have to provide hooks into its internal workings in the form of judiciously chosen protected methods
        /** {@link java.util.AbstractList#removeRange(int, int)} */

        //the only way to test a class designed for inheritance is to write subclasses; usually 3 are enough

        //constructors must not invoke overridable methods
        Child c = new Child();
        c.canBeOverridden1();
        c.canBeOverridden2();

        //cloneable
        //readObject, the overriding method will run before the subclass’s state has been deserialized
        //clone, the overriding method will run before the subclass’s clone method has a chance to fix the clone’s state

        //serializable
        //readResolve or writeReplace method protected

        //designing a class for inheritance requires great effort and places substantial limitations on the class
    }
}
