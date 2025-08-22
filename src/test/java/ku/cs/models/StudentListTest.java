package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    Student s1, s2, s3;
    StudentList students;
    @BeforeEach
    void init() {
        students = new StudentList();
        students.addNewStudent("67xxxxx1", "test1");
        students.addNewStudent("67xxxxx2", "test2", 40);
        students.addNewStudent("67xxxxx3", "test3", 20);
    }

    @Test
    void testAddNewStudent() {
        students.addNewStudent("67xxxxx4", "test4");
        assertEquals(4, students.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        assertEquals("test1", students.findStudentById("67xxxxx1").getName());
    }

    @Test
    void testFilterByName() {
        assertEquals(1, students.filterByName("test2").getStudents().size());
    }

    @Test
    void testGiveScoreToId() {
        students.giveScoreToId("67xxxxx1", 50);
        assertEquals(50, students.findStudentById("67xxxxx1").getScore());
    }

    @Test
    void testViewGradeOfId() {
        String grade = students.viewGradeOfId("67xxxxx2");
        assertEquals("F", grade);
    }

}