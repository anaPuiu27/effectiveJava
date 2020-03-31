package chapter7_lambdasAndStreams.item45_streamsUsage;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

import java.math.BigInteger;
import java.util.stream.Stream;

public class UseStreamsJudiciously {

    //Overusing streams makes programs hard to read and maintain
    //refrain from using streams to process char values

    public static void main(String[] args) {

        "Hello world!".chars().forEach(System.out::print);
        //721011081081113211911111410810033

        System.out.println();

        "Hello world!".chars().forEach(x -> System.out.print((char) x));
        //Hello world!

        System.out.println();

        Stream.iterate(TWO, BigInteger::nextProbablePrime)
                .map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

}
