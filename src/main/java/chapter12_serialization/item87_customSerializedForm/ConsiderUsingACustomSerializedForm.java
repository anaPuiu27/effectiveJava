package chapter12_serialization.item87_customSerializedForm;

public class ConsiderUsingACustomSerializedForm {

    //Do not accept the default serialized form without first considering whether it is appropriate.
    //The default serialized form is likely to be appropriate if an object’s physical representation is identical to its logical content
    //Even if you decide that the default serialized form is appropriate, you often must provide a readObject method to ensure invariants and security

    //Regardless of what serialized form you choose, declare an explicit serial version UID in every serializable
    // class you write

}
