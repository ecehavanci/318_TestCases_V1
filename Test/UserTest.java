import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    Student student = new Student("Atalay", "Tanyeli", 1111, "1111");
    String password;

    @BeforeEach
    void setUp() {
        password = "2222";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void positiveSetPassword() {

        student.setPassword(password);
        assertEquals(password, student.getPassword());
    }

    @Test
    void negativeSetPassword() {

        student.setPassword(password);
        assertNotEquals("1111", student.getPassword());
    }

    @Test
    void getToken() {
    }

    @Test
    void getName() {
    }

    @Test
    void getSchoolID() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void getSurname() {
    }

    @Test
    void printLessons() {
    }

    @Test
    void findLesson() {
    }
}
