package binaryOperatorImpl;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    static void main() {
        BinaryOperator<Integer> findBiggerNumber = (firstNumber, secondNumber) -> firstNumber > secondNumber ? firstNumber : secondNumber;

        System.out.println(findBiggerNumber.apply(15, 25));
    }
}
