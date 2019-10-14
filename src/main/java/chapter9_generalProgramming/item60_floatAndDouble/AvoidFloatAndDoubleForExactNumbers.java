package chapter9_generalProgramming.item60_floatAndDouble;

public class AvoidFloatAndDoubleForExactNumbers {

    //The float and double types are particularly ill-suited for monetary calculations
    //it is impossible to represent 0.1 (or any other negative power of ten) as a float or double exactly

    //use BigDecimal, int or long for monetary calculations

    public static void main(String[] args){

        System.out.println(1.03 - 0.42);
        //0.6100000000000001 instead of 0.61
    }
}
