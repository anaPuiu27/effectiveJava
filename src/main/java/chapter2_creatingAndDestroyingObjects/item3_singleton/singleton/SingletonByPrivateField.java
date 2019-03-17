package chapter2_creatingAndDestroyingObjects.item3_singleton.singleton;

public class SingletonByPrivateField{

    public static final SingletonByPrivateField INSTANCE = new SingletonByPrivateField();

    private SingletonByPrivateField(){
        // do something
    }

    public void doSomething(){

    }
}