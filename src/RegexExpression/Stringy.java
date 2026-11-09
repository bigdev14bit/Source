package RegexExpression;

import java.util.ArrayList;
import java.util.List;

public class Stringy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
        for (String items : list) {
            list.remove(items);
        }
        System.out.println(list);
    }

}
