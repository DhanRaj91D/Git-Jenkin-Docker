package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EvenOddApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testinputIsEven() {
		assertTrue(Main.chekEvenOdd(122));
	}
}
