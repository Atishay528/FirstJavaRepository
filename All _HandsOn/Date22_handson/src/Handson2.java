/* Write a program that will have a Properties class object which is capable
 *  of storing some States of India
and their Capital. Use an Iterator to list all the elements stored in the Properties.*/
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
public class Handson2 {

	public static void main(String[] args) {
		Properties p = new Properties();
		//p.put("Mp","Bhopal"); we can use put also in place of setProperty
		p.setProperty("Madhya Pradesh", "Indore");
		p.setProperty("Maharaster", "Pune");
		p.setProperty("Uttar Pradesh", "Lucknow");
Set<Entry<Object,Object>> set = p.entrySet();
Iterator<Entry<Object,Object>> itr = set.iterator();
while(itr.hasNext()) {
	Entry<Object,Object> e = itr.next();
	System.out.println(e);
}
	}

}
