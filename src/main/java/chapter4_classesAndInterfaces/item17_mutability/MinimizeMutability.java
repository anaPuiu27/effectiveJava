package chapter4_classesAndInterfaces.item17_mutability;

import chapter4_classesAndInterfaces.item17_mutability.demo.Immutable;
import chapter4_classesAndInterfaces.item17_mutability.demo.ImmutableViaFactory;
import chapter4_classesAndInterfaces.item17_mutability.demo.Mutable;

import java.math.BigInteger;

public class MinimizeMutability {

    public static void main(String[] args) {

        //mutable rules
        //-> no mutators - object state cannot be modified
        //-> no extension
        //-> all fields final
        //-> all fields private
        //-> exclusive access to any mutable fields

        //BigInteger + BigDecimal -> immutable

        //adv
        //-> thread safe
        //-> easy to use
        //-> reliable
        //-> simple
        //-> no need for clone or copies
        //-> can share internals
        //-> great for using as keys
        //-> atomicity - no temporary inconsistency

        //dis adv
        //-> require a new separate object for each time distinct value

        //If a class cannot be made immutable, limit its mutability as much as possible

        Immutable v1 = new Immutable(1);
        Immutable v2 = new Immutable(2);

        Immutable v3 = v1.plus(v2);

        assert (v1.getV1() == 1);
        assert (v2.getV1() == 2);
        assert (v3.getV1() == 3);

        Mutable m1 = new Mutable(1);
        Mutable m2 = new Mutable(2);

        m2.add(m1);

        assert (m1.getV1() == 1);
        assert (m2.getV1() == 3);

        Immutable.ONE.plus(Immutable.TEN);

        Immutable negation = Immutable.TEN.negate();

        //! not final
        BigInteger.TWO.modPow(BigInteger.TEN, BigInteger.TEN); // MutableBigInteger

        //! copy constructor - not needed
        String myString = new String(new String("val"));

        //can change the effective implementation
        ImmutableViaFactory immutableViaFactory = ImmutableViaFactory.valueOf(4);
    }
}
