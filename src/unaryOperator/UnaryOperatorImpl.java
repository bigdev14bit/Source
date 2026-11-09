package unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    static void main() {
        UnaryOperator<Integer> squaredNumber = number -> number * number;

        System.out.println(squaredNumber.apply(5));
    }
}
