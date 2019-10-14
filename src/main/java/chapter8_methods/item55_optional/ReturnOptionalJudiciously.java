package chapter8_methods.item55_optional;

public class ReturnOptionalJudiciously {

    //Never return a null value from an optional returning method
    //Optionals are similar in spirit to checked exceptions
    //Container types, including collections, maps, streams, arrays, and optionals should not be wrapped in optionals
    //you should never return an optional of a boxed primitive type
    //it is almost never appropriate to use an optional as a key, value, or element in a collection or array
    //
}
