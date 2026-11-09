package Shege;

import java.util.function.Function;

public class Sigh {
    public static void main(String[] args) {
        Function<String, Integer> function = (name) -> {
            return name.length();
        };
        
        Integer result = function.apply("Intellij Idea");
        System.out.println(result);
    }
}
