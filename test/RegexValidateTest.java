import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegexValidateTest {
    @Test
    public void testValidateEmail() {
        String email = "p.nwakwo.native.semicolon.africa";
        boolean expected = Main.validate(email);
        assertFalse(expected);
    }

    @Test
    public void testValidateEmailWithDigit() {
        String email = "devbig14gmail.com";
        boolean expected = Main.validate(email);
        assertTrue(expected);
    }

    @Test
    public void testValidateWrongEmailFormat() {
        String email = ".com@300forlife";
        boolean expected = Main.validate(email);
        assertFalse(expected);
    }

    @Test
    public void testValidatePassword() {
        String number = "JavaCode@1";
        boolean expected = Main.checkThis(number);
        assertTrue(expected);
    }

}
