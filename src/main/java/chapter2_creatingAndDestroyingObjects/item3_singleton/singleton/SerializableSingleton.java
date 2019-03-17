package chapter2_creatingAndDestroyingObjects.item3_singleton.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final transient SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething(){

    }

    // readResolve method to preserve singleton property
    // Return the one true SerializableSingleton and let the garbage collector take care of the SerializableSingleton impersonator.
    private Object readResolve() {

        return INSTANCE;
    }
}
