package predicate;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main() {
        BiPredicate <Integer, Integer> isGreaterThan = (x, y) -> x > y;

        System.out.println(isGreaterThan.test(1, 2));
    }
}
