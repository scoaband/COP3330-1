package module05.ch08.p02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void defaultPerimeterShouldBe4() {
        Rectangle r1 = new Rectangle();
        assertEquals(r1.perimeter(), 4.0);
    }

    @Test
    void area() {
    }

    @Test
    void getLength() {
    }

    @Test
    void getWidth() {
    }
}