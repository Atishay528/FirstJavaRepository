

/*Write a program to store a group of employee names into a
 *  HashSet, retrieve the elements one by one using an Iterator.

*/

//HashSet in the set the order is randomly occur
import java.util.HashSet;
import java.util.Iterator;
public class Handson6 {

	public static void main(String[] args) {
		 HashSet ob=new HashSet();
		 ob.add("Atishay");
		 ob.add("Bob");
		 ob.add("alexa");
		 Iterator<String> it = ob.iterator();
		    while(it.hasNext())
		    {
		      System.out.println(it.next());

		    }
	}

}
