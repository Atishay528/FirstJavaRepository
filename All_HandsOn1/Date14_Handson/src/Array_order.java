//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
public class Array_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select two smallest and two largest
		int[] arr = {2,5,4,1,6,8,9,11};
	    
	    int min1 = arr[0];
	    int min2 = 0;
	    int max1 = arr[0];
	    int max2 = 0;
	    for(int i=1;i<arr.length;i++) {
	        if(arr[i] > max1) {
	            max2 = max1;
	            max1 = arr[i]; 
	        }else if(arr[i] < min1){
	            min2 = min1;
	            min1 = arr[i];
	        }
	    }
	  
	    System.out.println("maximum1 "+max1+" maximum2  "+max2);
	    System.out.println("minimum1 "+min1+" minimum2  "+min2); 
	}

}
