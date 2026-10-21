public class Main {
    public static void main(String[] args) {
        //System.out.println(validate("p.nwakwo@native.semicolon.africa"));
    }
    public static boolean validate(String email) {
        String regex = "^[a-zA-Z.]+@?[a-zA-Z.]+$";
        if(email == null) {
            return false;
        }
        return email.matches(regex);
    }

    public static boolean checkThis(String number) {
        String regex = "^(\\+234|0)[789][01]\\d{8}$";
        if(number == null) {
            return false;
        }
        return number.matches(regex);
    }
}
