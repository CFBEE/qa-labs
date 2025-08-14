package test.java.lab11_Testing;

import main.java.lab11_Testing.Security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityTest {

    private Security security;

    @BeforeEach
    void setUp() {
        security = new Security();
    }

    @Test
    void loginReturnsFalseWhenUserIdIsNull() {
        assertFalse(security.login(null, "ValidPass1"));
    }

    @Test
    void loginReturnsFalseWhenUserIdIsEmpty() {
        assertFalse(security.login("", "ValidPass1"));
    }

    @Test
    void loginReturnsFalseWhenPasswordIsNull() {
        assertFalse(security.login("validUser", null));
    }

    @Test
    void loginReturnsFalseWhenPasswordIsEmpty() {
        assertFalse(security.login("validUser", ""));
    }

    @Test
    void loginReturnsFalseWhenPasswordHasNoUppercaseLetter() {
        assertFalse(security.login("validUser", "password1"));
    }

    @Test
    void loginReturnsFalseWhenPasswordHasNoDigit() {
        assertFalse(security.login("validUser", "Password"));
    }

    @Test
    void loginReturnsFalseWhenPasswordIsShorterThanEightCharacters() {
        assertFalse(security.login("validUser", "P4ss"));
    }

    @Test
    void loginReturnsTrueWhenUserIdAndPasswordMeetAllRequirements() {
        assertTrue(security.login("validUser", "ValidPass1"));
    }

    @Test
    void loginReturnsTrueWhenPasswordHasUppercaseAndDigitAndIsMinimumLength() {
        assertTrue(security.login("validUser", "Passw0rd"));
    }


}
