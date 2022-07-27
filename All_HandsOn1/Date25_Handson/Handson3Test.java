import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Handson3Test {
Handson3 h3 = new Handson3();
	@Test
	void testPalindromeCheck() {
		assertTrue(h3.palindromeCheck("dad"));
		assertTrue(h3.palindromeCheck("mom"));
	}

}













/*void testPalindromeCheck() {
//assertTrue(h3.palindromeCheck("dad"));
assertEquals(h3.palindromeCheck("mom"));
//assertEquals("Result",h3.palindromeCheck("naman"));
}
private void assertEquals(boolean palindromeCheck) {
// TODO Auto-generated method stub
*/