import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@Test
	public void testSumy() {
		Suma suma = new Suma();
		assertEquals(4.0 + 3.0, suma.zsumuj(4.0, 3.0));
	}

}
