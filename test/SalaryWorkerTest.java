import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2;

    @BeforeEach
    void setUp() {

        sw1 = new SalaryWorker("000001", "Billy", "Bob", "Mr.", 1999, 52000.0);
        sw2 = new SalaryWorker("000002", "Ella", "Seibert", "Ms.", 2004, 52000.0);

    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000.0, sw1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly pay (fraction of annual salary): $1000.0", sw2.displayWeeklyPay(50));
    }
}