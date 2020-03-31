package chapter12_serialization.item86_serializable;

public class ImplementSerializableWithGreatCaution {

    //A major cost of implementing Serializable is that it decreases the flexibility to change a class’s implementation once it has been released
    //A second cost of implementing Serializable is that it increases the likelihood of bugs and security holes
    //A third cost of implementing Serializable is that it increases the testing burden associated with releasing a new version of a class
    //Implementing Serializable is not a decision to be undertaken lightly
    //Classes designed for inheritance should rarely implement Serializable, and interfaces should rarely extend it
    //Inner classes should not implement Serializable
}
