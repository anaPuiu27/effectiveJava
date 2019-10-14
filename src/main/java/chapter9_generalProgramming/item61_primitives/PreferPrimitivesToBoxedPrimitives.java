package chapter9_generalProgramming.item61_primitives;

public class PreferPrimitivesToBoxedPrimitives {

    //Applying the == operator to boxed primitives is almost always wrong
    //Autoboxing reduces the verbosity, but not the danger, of using boxed primitives
    //when your program does unboxing, it can throw a NullPointerException
}
