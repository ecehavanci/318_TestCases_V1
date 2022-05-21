import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor = new Instructor("Kaan","Kurtel",1010,"1010");

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void positiveAddAndReturnLesson() {
        Lesson lesson = instructor.addAndReturnLesson("SE318",instructor);
        assertEquals(instructor.lessonList.get(0),lesson);
    }
    @Test
    void negativeAddAndReturnLesson() {
        Lesson lesson = instructor.addAndReturnLesson("SE318",instructor);
        assertNotEquals(new Lesson("SE318",instructor),lesson);
    }
    @Test
    void showLessonDetails() {
    }
}
