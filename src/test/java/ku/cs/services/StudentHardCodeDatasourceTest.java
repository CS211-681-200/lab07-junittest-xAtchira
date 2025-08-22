package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentList list;
    @BeforeEach
    void init() {
        list = new StudentList();
    }

    @Test
    void testReadData() {
        list.addNewStudent("6710400001", "First");
        list.addNewStudent("6710400002", "Second");
        list.addNewStudent("6710400003", "Third");
        list.addNewStudent("6710400004", "Fourth");
        assertEquals(4, list.getStudents().size());
    }

}