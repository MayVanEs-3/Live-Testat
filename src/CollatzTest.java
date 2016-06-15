import static org.junit.Assert.*;

import org.junit.Test;

public class CollatzTest {

	@Test
	public void test() {
		Collatz c = new Collatz();
		
		
		System.out.println("Geben Sie aus: "+c.FormelZurBerechnung(12));
		System.out.println();
		
		
	}

}
