import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Klasa testowa
 * 
 * @author Nelly
 *
 */
public class TestSuma {
	/**
	 * test sumowania 4.0 + 3.0
	 */
	@Test
	public void testSumy() {
		Suma suma = new Suma();
		assertEquals(4.0 + 3.0, suma.zsumuj(4.0, 3.0), 0.1);
	}

}
