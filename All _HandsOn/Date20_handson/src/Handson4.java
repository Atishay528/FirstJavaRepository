/*4) Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/
public class Handson4 {

	public static void main(String[] args) { 
int n = args.length;
		
		try {
			int[] arr = new int[n];
			int sum = 0;
			double avg = 0;
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);
			
			for (int i = 0; i < n; i++)
				sum += arr[i];
			
			avg = sum / n;
			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} 
		
		
		
}
}

