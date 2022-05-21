import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    Exam exam = new Exam();


    @BeforeEach
    void setUp() {
        exam.SetDate(new int[]{11,1,2022});
        exam.EditType("Midterm");
    }

    @AfterEach
    void tearDown() {

    }


    @Test
    void addQuestion() {
    }

    @Test
    void setDate() {
    }

    @Test
    void editType() {
    }

    @Test
    void positiveGetType() {
        String type = exam.GetType();
        assertEquals("Midterm",type);

    }
    @Test
    void negativeGetType() {
        String type = exam.GetType();
        assertNotEquals("Quiz",type);

    }

    @Test
    void getFullDate() {
    }

    @Test
    void positiveGetLongDate() {
        String date = exam.GetLongDate();
        assertEquals("11 Ocak 2022",date);

    }

    @Test
    void negativeGetLongDate() {
        String date = exam.GetLongDate();
        assertNotEquals("11 Ocak 2023",date);

    }

    @Test
    void printQuestions() {
    }

    @Test
    void printQuestionsWithAnswers() {
    }
}
