package test.java.lab11_Testing;

import static org.junit.jupiter.api.Assertions.*;

import main.java.lab11_Testing.Security;
import org.junit.jupiter.api.Test;

class SecurityTest {
    @Test
    public void testLoginEmptyUserId() {
        String userId = "", password = "Freddy99";
        Security security = new Security();
        boolean actual = security.login(userId, password);
        boolean expected = false;
        assertEquals(expected, actual);
        // assertFalse(actual);   // can also use this assert
    }

}
