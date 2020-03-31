package chapter12_serialization.item85_javaSerialization;

public class PreferAlternativesToJavaSerialization {

    //The best way to avoid serialization exploits is never to deserialize anything
    //There is no reason to use Java serialization in any new system you write
    //never deserialize untrusted data
    //Prefer whitelisting to blacklisting
}
