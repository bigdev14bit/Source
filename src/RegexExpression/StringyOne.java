package RegexExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringyOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            if(it.next().equals("b")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
