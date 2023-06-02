import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {


    @Test
    void returnTrue_ifPasswordLengthInRange(){
        int lengthPassword = 12;
        boolean actual = Password.checkPasswordLength(lengthPassword);
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_ifPasswordLengthToShort(){
        int lengthPassword = 0;
        boolean actual = Password.checkPasswordLength(lengthPassword);
        Assertions.assertFalse(actual);
    }

    @Test
    void returnFalse_ifPasswordLengthToLong(){
        int lengthPassword = 20;
        boolean actual = Password.checkPasswordLength(lengthPassword);
        Assertions.assertFalse(actual);
    }


    //Methode def: prüfe ob zahlen in einen String existieren

    //If false fehler ausgeben

    //if true ausgabe (eingabe erfolgreich)

    @Test
    void returnTrue_isPasswordContainsNumbers(){
        String password = "abc123";
        boolean actual = Password.checkPasswordChars(password);
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_isPasswordContainsNoNumbers(){
        String password = "abcdef";
        boolean actual = Password.checkPasswordChars(password);
        Assertions.assertFalse(actual);
    }

    @Test
    void returnTrue_ifPasswordContainsCapitals() {
        String password ="abCd123";
        boolean actual = Password.checkPasswordForCapitals(password);
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_ifPasswordContainsNoCapitals() {
        String password ="abcd123";
        boolean actual = Password.checkPasswordForCapitals(password);
        Assertions.assertFalse(actual);
    }

    @Test
    void inputIsBadPassword(){
        String password = "123456";
        boolean actual = Password.checkForBadPassword(password);
        Assertions.assertTrue(actual);
    }

    @Test
    void inputIsNotBadPassword(){
        String password = "ac7G32i";
        boolean actual = Password.checkForBadPassword(password);
        Assertions.assertFalse(actual);
    }

}
