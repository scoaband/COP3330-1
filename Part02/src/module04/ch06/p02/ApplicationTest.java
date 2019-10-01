package module04.ch06.p02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void calculateChargesMinValue() {
        assertEquals(Application.calculateCharges(3.0), 2.0, 0.001);
    }

    @Test
    void calculateCharagesMaxValue() {
        assertEquals(Application.calculateCharges(24.0), 10.0, 0.001);
    }
}