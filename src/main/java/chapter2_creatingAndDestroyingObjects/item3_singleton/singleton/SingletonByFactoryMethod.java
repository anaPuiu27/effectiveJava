package chapter2_creatingAndDestroyingObjects.item3_singleton.singleton;

public class SingletonByFactoryMethod {

    private static final SingletonByFactoryMethod INSTANCE = new SingletonByFactoryMethod();

    private SingletonByFactoryMethod() {

    }

    public static SingletonByFactoryMethod getInstance(){
        return INSTANCE;
    }

    public void doSomething(){

    }

}
