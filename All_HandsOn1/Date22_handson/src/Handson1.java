/*
1)Create a Collection called HashMap which is capable of storing String objects.

 The program should have the following abilities

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.*/
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
public class Handson1 {

	public static void main(String[] args) {
		Map<String,String> H1 = new HashMap<>();
		
		H1.put("MadhyaPradesh","Bhopal");
		H1.put("Maharastra", "Mumbai");
		H1.put("Uttar Pradesh","Lucknow");

		//part 1
		Set<Entry<String,String>> set = H1.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
		Map.Entry<String,String> m = itr.next();
		
	     if(m.getKey().equals("Maharastra"))
		{
		System.out.println("Key exist");
		break;
		}
		}
		
	//B part
	set = H1.entrySet();
	itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,String> m = itr.next();
		if(m.getValue().equals("Bhopal"))
		{
			System.out.println("Value Exist");
			break;
		}
	}
	
	//c part
	set = H1.entrySet();
	itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,String> m  =  itr.next();
		System.out.println(m);
		//System.out.println("Key: " + m.getKey() + ", Value: " + m.getValue());	
	}
	}

}
