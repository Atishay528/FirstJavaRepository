import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 ob = new Demo1();
		String res = ob.StringConcat("Atishay" , "Jain");
		assertEquals("AtishayJain",res);
		}

}
