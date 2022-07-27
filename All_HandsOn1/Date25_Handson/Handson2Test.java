import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
class Handson2Test {
	Handson2 e = new Handson2();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Atishay");
		list.add("Alice");
		list.add("Bob");
	}

	@Test
	void testFindName() {
		
		assertEquals("FOUND", e.findName(list, "Alice"));
		
	
	}

}
