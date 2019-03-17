package chapter2_creatingAndDestroyingObjects.item1_factoryMethods;

import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.inheritance.BaseLivingCreature;
import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.inheritance.Bird;
import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.inheritance.Dog;
import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.interfaces.BirdImpl;
import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.interfaces.DogImpl;
import chapter2_creatingAndDestroyingObjects.item1_factoryMethods.interfaces.LivingCreature;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

public class StaticFactoryMethodsOverConstructors {

    public static void main(String[] args) {

        //adv
        factoryMethodsCanHaveDescriptiveNames();
        factoryMethodsAreNotRequiredToCreateANewInstanceEveryTime();
        factoryMethodsCanReturnAnObjectOfAnySubtypeOfTheirReturnType();
        theClassOfTheReturnedObjectCanVaryFromCallToCall();
        theClassOfTheReturnedObjectNeedNotExistWhenTheClassContainingTheMethodIsWritten();

        //dis adv
        classesWithoutPublicOrProtectedConstructorsCannotBeSubclassed();
        factoryMethodsAreHardForProgrammersToFind();
    }

    public static void factoryMethodsCanHaveDescriptiveNames() {

        BigInteger fromConstructor = new BigInteger(20, 95, new Random());
        BigInteger fromFactory = BigInteger.probablePrime(20, new Random());
    }

    public static void factoryMethodsAreNotRequiredToCreateANewInstanceEveryTime() {

        Boolean newInstance = new Boolean("true");
        Boolean sameStaticInstance = Boolean.valueOf("true");
    }

    public static void factoryMethodsCanReturnAnObjectOfAnySubtypeOfTheirReturnType() {

        //base class
        BaseLivingCreature baseDog = new Dog("species");
        BaseLivingCreature baseBird = new Bird("species");
        baseDog = BaseLivingCreature.getCreature("species", true);
        baseBird = BaseLivingCreature.getCreature("species", true);

        //interface
        LivingCreature dog = new DogImpl();
        LivingCreature bird = new BirdImpl();
        dog = LivingCreature.getCreature(false);
        bird = LivingCreature.getCreature(true);
    }

    public static void theClassOfTheReturnedObjectCanVaryFromCallToCall() {
        // in time BirdImpl is replaced with PerformanceBirdImpl
        // behavior stays the same
    }

    public static void theClassOfTheReturnedObjectNeedNotExistWhenTheClassContainingTheMethodIsWritten() {
        //JDBI - can at any time switch to another implementation based on criteria
    }

    public static void classesWithoutPublicOrProtectedConstructorsCannotBeSubclassed() {

    }

    public static void factoryMethodsAreHardForProgrammersToFind() {
        //common naming
        Date date = Date.from(Instant.now());
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

    }
}
