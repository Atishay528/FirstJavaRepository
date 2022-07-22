/*5) Write a program to accept gender ("Male" or "Female") and age from the key board and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/

import java .util.Scanner;
public class fifth_handson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gender is");
		String gender = sc.nextLine();
		System.out.println("age is");
		int age = sc.nextInt();
	
		if(gender.equals("Female")) {
			if(age>=18 && age<=58) {
				System.out.println("Interest 8.2%");
			}
			else if(age>58 && age<=100) {
				System.out.println("Interest 9.2%");
			}
			else {
				System.out.println("No result");
			}
		}
		else {
			if(age>=18 && age<=58) {
				System.out.println("Interest 8.4");
			}
			else if(age>58 && age<=100){
				System.out.println("Interest 10.2");
			}
			else {
				System.out.println("Not found result");
			}
			
		}

	}

}
