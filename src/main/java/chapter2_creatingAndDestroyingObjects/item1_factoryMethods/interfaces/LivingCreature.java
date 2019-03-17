package chapter2_creatingAndDestroyingObjects.item1_factoryMethods.interfaces;

public interface LivingCreature {

    static LivingCreature getCreature(boolean hasWings) {

        if (hasWings) {
            return new BirdImpl();
        } else{
            return new DogImpl();
        }
    }

    void doSomething();
}
