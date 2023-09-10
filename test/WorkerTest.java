import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
       w1 = new Worker("000001", "Billy", "Bob", "Mr.", 1999, 30.30);
       w2 = new Worker("000002", "Ella", "Seibert", "Ms.", 2004, 35.00);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(303.0, w1.calculateWeeklyPay(10.0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Worked 40.0 hours and was payed $1400.0. \n" +
                " Worked 0.0 overtime hours and was payed $0.0in overtime pay. \n" +
                " Worked 40.0hours in total and was payed $1400.0total.", w2.displayWeeklyPay(40.0));
    }
}