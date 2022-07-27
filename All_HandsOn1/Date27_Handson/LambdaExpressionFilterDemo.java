/*3) Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of productsin the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price

Sample output

Iphone 6S: 65000.0

Sony Xperia: 25000.0

Redmi4 : 26000.0

*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product1{

  int id;

  String name;

  float price;

  public Product1(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}



public class LambdaExpressionFilterDemo{

  public static void main(String[] args) {

    List<Product1> list=new ArrayList<Product1>();

    //Adding Products

    list.add(new Product1(1,"HP Laptop",2500f));

    list.add(new Product1(3,"Keyboard",30009f));

    list.add(new Product1(2,"Dell Mouse",150090f));
    
    
    //using list
    Stream<Product1>productPriceList = list.parallelStream().filter(p->p.price>20000);
    
    productPriceList.forEach(
    		p ->  System.out.println(p.name+":"+p.price)
    
    );
  
    //using map
    
    
    Map<Object,Object> productPriceList1 = list.parallelStream()
    		.filter(p->p.price>20000)
    .collect(Collectors.toConcurrentMap(p->p.name, p->p.price));
    productPriceList1.forEach((name,price) ->  System.out.println(name+":"+price));
    //uisng map
   
/*
    Map<String,Float> productPriceMap =   list.stream() 
    		.filter(p -> p.price>20000)
    		            .collect(Collectors.toMap(p->p.name, p->p.price));  
    		  
    		System.out.println(productPriceMap);
    		
    		
    		
    	*/		
    	   
    		///only price print
//    	    list.stream()
//    		.filter(p->p.price>20000)
//    		.map(p->p.price)
//    		
//    		.forEach(System.out::println);		
    		
  }
}

