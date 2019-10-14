package chapter8_methods.item52_overloading;

public class UseOverloadingJudiciously {

    //selection among overloaded methods is static
    //selection among overridden methods is dynamic - the “most specific” overriding method always gets executed

    //never to export two overloadings with the same number of parameters
    //you can always give methods different names instead of overloading them
    //do not overload methods to take different functional interfaces in the same argument position

}
