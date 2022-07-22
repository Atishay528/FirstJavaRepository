//Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {21, 53, 92, 16, 30};
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	                
	            if (arr[i] < min)
	                min = arr[i];   
	            
	        }
	        System.out.println("Min value " + min);
	        System.out.println("Max value " + max);

	}

}
