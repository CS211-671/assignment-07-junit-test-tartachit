package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("01", "A");
        studentList.addNewStudent("02", "B");
        assertEquals(2, studentList.getStudents().size());
        assertEquals("02", studentList.findStudentById("02").getId());
        studentList.addNewStudent("03", "C", 79);
        assertEquals(79, studentList.findStudentById("03").getScore());
    }

    @Test
    void testFindStudentById() {
        studentList.addNewStudent("01", "A");
        studentList.addNewStudent("02", "B");
        studentList.addNewStudent("03", "C");
        assertEquals("02", studentList.findStudentById("02").getId());
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("01", "A");
        studentList.giveScoreToId("01", 78);
        assertEquals(78, studentList.findStudentById("01").getScore());
    }

    @Test
    void testViewGrade() {
        studentList.addNewStudent("01", "A", 81);
        String grade = studentList.viewGradeOfId("01");
        assertEquals("A", grade);
    }
}