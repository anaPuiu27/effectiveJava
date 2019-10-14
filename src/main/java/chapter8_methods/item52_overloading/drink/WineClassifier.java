package chapter8_methods.item52_overloading.drink;

import java.util.List;

public class WineClassifier {

    public static void main(String[] args){

        List<Wine> wineList = List.of(new Wine(), new ExpensiveWine());
        for (Wine wine : wineList) {
            System.out.println(wine.name());
        }

        for (Wine wine : wineList) {
            System.out.println(name(wine));
        }
    }

    public static String name(Wine wine){
        return "Wine";
    }

    public static String name(ExpensiveWine wine){
        return "ExpensiveWine";
    }
}
