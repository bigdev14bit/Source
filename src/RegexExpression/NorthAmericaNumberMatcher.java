package RegexExpression;

public class NorthAmericaNumberMatcher {
    public static void main(String[] args) {
        NorthAmericaNumberMatcher matcher = new NorthAmericaNumberMatcher();
        System.out.println(matcher.match("(707)-827-7019"));
        //System.out.println(match("707-827-7019);
    }

    public boolean match(String phoneNumber) {
        String regex = "^(\\d{3}?)[.-]\\d{3}\\-(\\d{4})$";
        return phoneNumber.matches(regex);
    }
}
