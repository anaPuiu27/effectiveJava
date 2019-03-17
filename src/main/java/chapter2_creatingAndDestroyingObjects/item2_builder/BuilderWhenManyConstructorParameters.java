package chapter2_creatingAndDestroyingObjects.item2_builder;

import chapter2_creatingAndDestroyingObjects.item2_builder.nutritionfacts.NutritionFactsBuilderPattern;
import chapter2_creatingAndDestroyingObjects.item2_builder.nutritionfacts.NutritionFactsJavaBeanPattern;
import chapter2_creatingAndDestroyingObjects.item2_builder.nutritionfacts.NutritionFactsTelescopingConstructor;
import chapter2_creatingAndDestroyingObjects.item2_builder.pizza.Calzone;
import chapter2_creatingAndDestroyingObjects.item2_builder.pizza.NyPizza;

import static chapter2_creatingAndDestroyingObjects.item2_builder.pizza.NyPizza.Size.SMALL;
import static chapter2_creatingAndDestroyingObjects.item2_builder.pizza.Pizza.Topping.*;

public class BuilderWhenManyConstructorParameters {

    public static void main(String[] args) {

        telescopingConstructor();
        javaBeanPattern();
        builderPattern();

        //adv
        wellSuitedForClassHierarchies();

        //dis adv
        inOrderToCreateAnObjectYouNeedToCreateItsBuilder();
        builderPatternIsMoreVerbose();
    }

    public static void telescopingConstructor() {
        //error prone, hard to maintain
        NutritionFactsTelescopingConstructor tc = new NutritionFactsTelescopingConstructor(1, 2);
        tc = new NutritionFactsTelescopingConstructor(1, 2, 3);
        tc = new NutritionFactsTelescopingConstructor(1, 2, 4, 6);
        tc = new NutritionFactsTelescopingConstructor(1, 2, 0, 5, 6);
        tc = new NutritionFactsTelescopingConstructor(1, 0, 4, 6, 0, 4);
    }

    public static void javaBeanPattern() {
        //may be in an inconsistent state partway through its construction
        //prevents immutability
        NutritionFactsJavaBeanPattern jb = new NutritionFactsJavaBeanPattern();
        jb.setServingSize(240);
        jb.setServings(8);
        jb.setCalories(100);
        jb.setSodium(35);
    }

    public static void builderPattern() {

        //simulates named optional parameters
        NutritionFactsBuilderPattern cocaCola = new NutritionFactsBuilderPattern.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }

    public static void wellSuitedForClassHierarchies() {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }

    public static void inOrderToCreateAnObjectYouNeedToCreateItsBuilder() {

    }

    public static void builderPatternIsMoreVerbose() {

    }
}
