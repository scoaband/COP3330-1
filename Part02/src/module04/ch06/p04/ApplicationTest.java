package module04.ch06.p04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicationTest {

	@Test
	void roundToIntegerShouldRoundDown() {
		assertEquals(10, Application.roundToInteger(10.3));
	}

	@Test
	void roundToIntegerShouldRoundUp() {
		assertEquals(11, Application.roundToInteger(10.5));
	}

}
