package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init() {
        s = new Student("67xxxxxx", "test");
    }


    @Test
    @DisplayName("เพิ่มคะแนนนิสิต 49 และ 2 คะแนน")
    void testAddScore() {
        s.addScore(40);
        assertEquals(40, s.getScore());
        s.addScore(20);
        assertEquals(60, s.getScore());
    }

    @Test
    void testCalculateGrade() {
        s.addScore(30);
        assertEquals("F", s.grade());
    }

    @Test
    void testChangeName() {
        s.changeName("John");
        assertEquals("John", s.getName());
    }

    @Test
    void testIsId() {
        assertEquals(true, s.isId("67xxxxxx"));
    }

    @Test
    void testIsNameContains() {
        assertEquals(true, s.isNameContains("t"));
        assertEquals(true, s.isNameContains("e"));
        assertEquals(true, s.isNameContains("s"));
        assertEquals(true, s.isNameContains("t"));
    }

}