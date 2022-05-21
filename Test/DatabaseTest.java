import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db = new Database();
    String name;
    String lessonName;

    @BeforeEach
    void setUp() {
        name = "Kaan";
        lessonName = "SE318";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void positiveRegisterInstructor() {
        db.registerInstructor(name, "Kurtel", 1010, "1010");
        assertEquals(name, db.userList.get(0).getName());
    }

    @Test
    void negativeRegisterInstructor() {
        db.registerInstructor(name, "Kurtel", 1010, "1010");
        assertNotEquals("Ufuk", db.userList.get(0).getName());

    }

    @Test
    void registerStudent() {
    }

    @Test
    void logIn() {
    }


    @Test
    void positiveAddLesson() {
        db.userList.add(new Instructor("Kaan", "Kurtel", 1010, "1010"));
        Instructor instructor = (Instructor) db.userList.get(0);
        Lesson lesson = new Lesson(lessonName, instructor);
        db.addLesson(lesson);
        assertEquals(lesson.getName(), db.lessonList.get(0).getName());
    }

    @Test
    void negativeAddLesson() {
        db.userList.add(new Instructor("Kaan", "Kurtel", 1010, "1010"));
        Instructor instructor = (Instructor) db.userList.get(0);
        Lesson lesson = new Lesson(lessonName, instructor);
        db.addLesson(lesson);
        assertNotEquals(lesson.getName(), "HIST");

    }

    @Test
    void findLesson() {
    }

    @Test
    void showLessons() {
    }
}
