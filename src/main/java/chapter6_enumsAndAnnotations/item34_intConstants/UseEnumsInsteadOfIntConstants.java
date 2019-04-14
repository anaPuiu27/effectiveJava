package chapter6_enumsAndAnnotations.item34_intConstants;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UseEnumsInsteadOfIntConstants {

    public static void main(String[] args) {
        //Use enums any time you need a set of constants whose members are known at compile time
    }

    // The int enum pattern - severely deficient!
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    //enums - classes that export one instance for each enumeration constant via a public static final field
    //instance-controlled
    //generalization of singletons
    public enum Apple {
        FUJI, PIPPIN, GRANNY_SMITH
    }

    public enum Orange {NAVEL, TEMPLE, BLOOD}

    // Enum type with data and behavior
    public enum Planet {
        MERCURY(3.302e+23, 2.439e6),
        VENUS(4.869e+24, 6.052e6),
        EARTH(5.975e+24, 6.378e6),
        MARS(6.419e+23, 3.393e6),
        JUPITER(1.899e+27, 7.149e7),
        SATURN(5.685e+26, 6.027e7),
        URANUS(8.683e+25, 2.556e7),
        NEPTUNE(1.024e+26, 2.477e7);

        private final double mass; // in kg
        private final double radius; // In meters
        private final double surfaceGravity; // In m / s^2

        // Universal gravitational constant in m^3 / kg s^2
        private static final double G = 6.67300E-11;

        // Constructor
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            surfaceGravity = G * mass / (radius * radius);
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public double getSurfaceGravity() {
            return surfaceGravity;
        }

        public double getSurfaceWeight(double mass) {
            return mass * surfaceGravity; // F = ma
        }
    }

    // Enum type that switches on its own value - questionable
    public enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE;

        // Do the arithmetic operation represented by this constant
        public double apply(double x, double y) {
            switch (this) {
                case PLUS:
                    return x + y;
                case MINUS:
                    return x - y;
                case TIMES:
                    return x * y;
                case DIVIDE:
                    return x / y;
            }
            throw new AssertionError("Unknown op: "
                    +
                    this);
        }
    }

    // Enum type with constant-specific method implementations
    public enum Operation2 {
        PLUS("+") {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            public double apply(double x, double y) {
                return x - y;
            }
        },
        TIMES("*") {
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            public double apply(double x, double y) {
                return x / y;
            }
        };

        private final String symbol;

        Operation2(String symbol) {
            this.symbol = symbol;

            //static fields have not yet been initialized
            //stringToEnum.put("", Operation2.DIVIDE);
        }

        @Override
        public String toString() {
            return symbol;
        }

        public abstract double apply(double x, double y);

        // Implementing a fromString method on an enum type
        private static final Map<String, Operation2> stringToEnum =
                Stream.of(values()).collect(toMap(Object::toString, e -> e));

        // Returns Operation for string, if any
        public static Optional<Operation2> fromString(String symbol) {
            return Optional.ofNullable(stringToEnum.get(symbol));
        }
    }

    // Enum that switches on its value to share code - questionable
    enum PayrollDay {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay;
            switch (this) {
                case SATURDAY:
                case SUNDAY: // Weekend
                    overtimePay = basePay / 2;
                    break;
                default: // Weekday
                    overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                            0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            }
            return basePay + overtimePay;
        }
    }

    // The strategy enum pattern
    enum PayrollDayStrategy {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY(PayType.WEEKEND),
        SUNDAY(PayType.WEEKEND);

        private final PayType payType;

        PayrollDayStrategy(PayType payType) {
            this.payType = payType;
        }

        //Default
        PayrollDayStrategy() {
            this(PayType.WEEKDAY);
        }

        int pay(int minutesWorked, int payRate) {
            return payType.pay(minutesWorked, payRate);
        }

        // The strategy enum type
        private enum PayType {
            WEEKDAY {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked <= MINS_PER_SHIFT ? 0 :
                            (minsWorked - MINS_PER_SHIFT) * payRate / 2;
                }
            },
            WEEKEND {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked * payRate / 2;
                }
            };

            abstract int overtimePay(int mins, int payRate);

            private static final int MINS_PER_SHIFT = 8 * 60;

            int pay(int minsWorked, int payRate) {
                int basePay = minsWorked * payRate;
                return basePay + overtimePay(minsWorked, payRate);
            }
        }
    }
}