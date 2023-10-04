import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void StudentTest1() {
        assertEquals(0, Student.getLoanAmount(2.3, StudentSituation.POOR));
    }

    @Test
    public void StudentTest2() {
        assertThrows(RuntimeException.class,
                () -> Student.getLoanAmount(-1, StudentSituation.NORMAL)
        );
    }

    @Test
    public void StudentTest3() {
        assertEquals(0, Student.getLoanAmount(1.7, StudentSituation.NEEDY));
    }

    @Test
    public void StudentTest4() {
        assertEquals(0, Student.getLoanAmount(2.7, StudentSituation.NORMAL));
    }

    @Test
    public void StudentTest5() {
        assertEquals(12_000_000, Student.getLoanAmount(3.9, StudentSituation.NEEDY));
    }

    @Test
    public void StudentTest6() {
        assertEquals(6_000_000, Student.getLoanAmount(3.1, StudentSituation.POOR));
    }

    @Test
    public void StudentTest7() {
        assertEquals(15_000_000, 3.7, Student.getLoanAmount(3.7, StudentSituation.POOR));
    }

    @Test
    public void StudentTest8() {
        assertEquals(6_000_000, Student.getLoanAmount(3.4, StudentSituation.NEEDY));
    }

    @Test
    public void StudentTest9() {
        assertEquals(6_000_000, Student.getLoanAmount(2.8, StudentSituation.POOR));
    }

    @Test
    public void StudentTest10() {
        assertEquals(0, Student.getLoanAmount(2.6, StudentSituation.NORMAL));
    }

    @Test
    public void StudentTest11() {
        assertEquals(12_000_000, Student.getLoanAmount(3.3, StudentSituation.POOR));
    }

    @Test
    public void StudentTest12() {
        assertEquals(0, Student.getLoanAmount(3.2, StudentSituation.NORMAL));
    }

    @Test
    public void StudentTest13() {
        assertEquals(6_000_000, Student.getLoanAmount(3.5, StudentSituation.NEEDY));
    }

    @Test
    public void StudentTest14() {
        assertEquals(0, Student.getLoanAmount(3.5, StudentSituation.NORMAL));
    }

    @Test
    public void StudentTest15() {
        assertEquals(15_000_000, Student.getLoanAmount(3.8, StudentSituation.POOR));
    }

    @Test
    public void StudentTest16() {
        assertEquals(0, Student.getLoanAmount(0, StudentSituation.NORMAL));
    }

    @Test
    public void StudentTest17() {
        assertEquals(12_000_000, Student.getLoanAmount(4.0, StudentSituation.NEEDY));
    }

    @Test
    public void StudentTest18() {
        assertEquals(0, Student.getLoanAmount(3.7, StudentSituation.NORMAL));
    }

}
