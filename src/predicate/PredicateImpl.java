package predicate;

import java.util.function.Predicate;

public class PredicateImpl {
    static void main() {
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        System.out.println(isEvenNumber.test(1));
    }
}
