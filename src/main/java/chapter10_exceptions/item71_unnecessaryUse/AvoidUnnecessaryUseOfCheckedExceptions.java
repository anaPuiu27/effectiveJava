package chapter10_exceptions.item71_unnecessaryUse;

public class AvoidUnnecessaryUseOfCheckedExceptions {

    public static void main(String[] args) {
        //methods throwing checked exceptions can’t be used directly in streams
        //when used sparingly, checked exceptions can increase the reliability of programs
        //when overused, they make APIs painful to use
        //if callers won’t be able to recover from failures, throw unchecked exceptions
    }
}
