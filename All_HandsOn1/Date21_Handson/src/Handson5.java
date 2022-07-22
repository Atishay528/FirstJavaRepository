//SET HANDSON


/*Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.

NOTE: You can test the methods using a main method.
*/
import java.util.HashSet;
import java.util.Iterator;
class Country{
	HashSet<String> h1 = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName)
	{
		h1.add(CountryName);
		return h1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = h1.iterator();
		while(it.hasNext()) {
			if(it.next().equals(CountryName)) {
				return CountryName;
			}
		}
		return null;
	}
	
}

public class Handson5 {

	public static void main(String[] args) {
		
	Country c = new Country();
	c.saveCountryNames("India");
	c.saveCountryNames("USA");
	c.saveCountryNames("Japan");
	c.saveCountryNames("China");
	c.saveCountryNames("Russia");
	
	System.out.println("India " +c.getCountry("India"));	
	System.out.println("SouthAfrica " +c.getCountry("SouthAfrica"));
		

	}

}
