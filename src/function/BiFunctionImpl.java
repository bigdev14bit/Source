package function;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    static void main() {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;

        System.out.println(biFunction.apply(1, 2));
    }
}
