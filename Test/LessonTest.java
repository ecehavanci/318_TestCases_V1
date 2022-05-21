import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessonTest {
    Lesson lesson = new Lesson("SE318",new Instructor("Kaan", "Kurtel",1010,"1010"));

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void positiveAddExam() {
        Exam exam = new Exam();
        int examCount = lesson.ExamCount();
        lesson.AddExam(exam);
        int examCount2 = lesson.ExamCount();
        assertEquals(examCount+1,examCount2);
    }

    @Test
    void negativeAddExam() {
        Exam exam = new Exam();
        int examCount = lesson.ExamCount();
        lesson.AddExam(exam);
        int examCount2 = lesson.ExamCount();
        assertNotEquals(examCount,examCount2);
    }
    @Test
    void getExam() {
    }

    @Test
    void examCount() {
    }

    @Test
    void getName() {
    }

    @Test
    void positiveSetName() {
        String name = "SE318";
        lesson.setName(name);
        assertEquals(name,lesson.getName());
    }
    @Test
    void negativeSetName() {
        String name = "SE318";
        lesson.setName(name);
        assertNotEquals("SE311",lesson.getName());
    }

    @Test
    void showExamDetails() {
    }

    @Test
    void print() {
    }
}
