package function;

import java.util.function.Function;

public class FunctionImpl {
    static void main() {
        Function<String, String> changeToUpperCase = (name)-> name.toUpperCase();

        System.out.println(changeToUpperCase.apply("Hello"));
    }
}
