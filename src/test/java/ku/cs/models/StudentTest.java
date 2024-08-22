package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610402051", "tar");
    }
    @Test
    void testAddScore() {
        //Student s1 = new Student("6xxxxxxxxx", "tar");
        s1.addScore(80);
        assertEquals(80, s1.getScore());
        s1.addScore(5);
        assertEquals(85, s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        //Student s1 = new Student("6xxxxxxxxx", "tar");
        s1.addScore(69);
        assertEquals("A", s1.grade());
    }

    @Test
    void testChangeName() {
        s1.changeName("Tachit");
        assertEquals("Tachit", s1.getName());
    }

    @Test
    void testIsId() {
        s1.isId("6610402051");
        assertEquals("6610402051", s1.getId());
    }

}