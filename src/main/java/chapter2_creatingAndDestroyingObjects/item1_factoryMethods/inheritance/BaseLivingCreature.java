package chapter2_creatingAndDestroyingObjects.item1_factoryMethods.inheritance;

public class BaseLivingCreature {

    private String species;

    public BaseLivingCreature(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void doSomething(){

    }

    public static BaseLivingCreature getCreature(String species, boolean hasWings) {

        if (hasWings) {
            return new Bird(species);
        } else{
            return new Dog(species);
        }
    }
}
