package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;

    @BeforeEach
    void setUp() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        //UserList userList = new UserList();
        userList.addUser("John", "Doe");
        userList.addUser("Jane", "Doe");
        userList.addUser("Jack", "Doe");

        // TODO: find one of them
        User user = userList.findUserByUsername("John");

        // TODO: assert that UserList found User
        String expected = "John";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("John", "Doe");
        userList.addUser("Jane", "Doe");
        userList.addUser("Jack", "Doe");

        // TODO: change password of one user
        userList.changePassword("Jane", "Doe", "12345");
        // TODO: assert that user can change password
        assertTrue(userList.findUserByUsername("Jane").validatePassword("12345"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("John", "Doe");
        userList.addUser("Jane", "Doe");
        userList.addUser("Jack", "Doe");
        // TODO: call login() with correct username and password
        userList.login("John", "Doe");
        // TODO: assert that User object is found
        assertEquals("John", userList.findUserByUsername("John").getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("John", "Doe");
        userList.addUser("Jane", "Doe");
        userList.login("John", "Doe");
        // TODO: call login() with incorrect username or incorrect password
        userList.login("Jack", "12345");
        // TODO: assert that the method return null
        assertNull(userList.login("Jack", "12345"));
    }

}