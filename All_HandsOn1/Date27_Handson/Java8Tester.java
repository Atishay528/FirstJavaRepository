/*Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list

Step1: create Java main class Java8 Tester

Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)

Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters

Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters

Sample output

Print all numbers:

1

2

3

4

5

6

7

8

9

Print even numbers:

2

4

6

8

Print numbers greater than 3:

4

5

6

7

8

9
*/
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
public class Java8Tester {
	
public static void eval(Predicate<Integer>p,List<Integer> li) {
	for(int i=1;i<=li.size();i++) {
	if(p.test(i)) {
		System.out.println(i);
	}
	}
}
	public static void main(String[] args) {
		
	List<Integer> li = new ArrayList<>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
	li.add(5);
	li.add(6);
	li.add(7);
	li.add(9);
	li.add(9);
		Predicate <Integer> p1 = I->I%2==0;
	Predicate<Integer>p2=I->I>3;
	System.out.println("all even no");
	eval(p1,li);
	System.out.println("Greater 3 number");
	eval(p2,li);
	
	}

}

