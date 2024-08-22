package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void init() {
        user = new User("user01", "1234");
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        //User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "1234";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        //User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("1234");
        assertTrue(actual);
    }

    @Test
    void testIsUsername() {
        assertEquals("user01", user.getUsername());
    }

    @Test
    void testSetPassword() {
        user.setPassword("12345");
        assertEquals("12345", user.getPassword());
    }
}