package RegexExpression;

import java.util.ArrayList;
import java.util.List;

public class NewFirstItem {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ada", "Tunde", "Zainab", "Bola", "Emeka", "Chloe", "Byran", "Ryan"));
        names.add(0, "Ife");
        System.out.println(names);
        
    }
}
