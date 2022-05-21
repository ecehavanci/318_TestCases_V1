import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db = new Database();
    String name;
    String lessonName;
    User user;

    @BeforeEach
    void setUp() {
        name = "Kaan";
        lessonName = "SE318";
        user = new Student("Mehmet", "Yenilmez", 12, "password");
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
    void registerStudentPositive() {
        db.registerStudent("Ardınç", "Yenilmez", 15, "password2");
        User user = db.userList.get(0);
        assertEquals(15, user.getSchoolID());
    }

    @Test
    void registerStudentNegative() {
        db.registerStudent("Ardınç", "Yenilmez", 15, "password2");
        User user = db.userList.get(0);
        assertNotEquals(20, user.getSchoolID());
    }

    @Test
    void logInPositive() throws WrongEmailException, WrongPasswordException {
        db.registerStudent(name, "Kurtel", 1010, "1010");
        User user2 = db.logIn(1010, "1010");
        assertNotNull(user2);
        assertEquals(db.userList.get(0).getSchoolID(), user2.getSchoolID());

    }

    @Test
    void logInNegative() throws WrongEmailException, WrongPasswordException {
        db.registerStudent(name, "Kurtel", 1010, "1010");
        User user2 = db.logIn(1010, "1010");
        assertNotNull(user2);
        assertNotEquals(user.getSchoolID(), user2.getSchoolID());

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
    void findLessonPositive() throws LessonNotFoundException {
        db.userList.add(new Instructor("Kaan", "Kurtel", 1010, "1010"));
        Instructor instructor = (Instructor) db.userList.get(0);
        Lesson lesson = new Lesson(lessonName, instructor);
        db.addLesson(lesson);
        Lesson findLesson = db.FindLesson(lessonName);
        assertEquals(findLesson.getName(), lesson.getName());
    }

    @Test
    void findLessonNegative() throws LessonNotFoundException {
        db.userList.add(new Instructor("Kaan", "Kurtel", 1010, "1010"));
        Instructor instructor = (Instructor) db.userList.get(0);
        Lesson lesson = new Lesson(lessonName, instructor);
        db.addLesson(lesson);
        Lesson findLesson = db.FindLesson(lessonName);
        assertNotEquals("LessonName", lesson.getName());
    }

    @Test
    void showLessons() {

    }
}
