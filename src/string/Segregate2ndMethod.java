package string;

public class Segregate2ndMethod {
	/** 

	Segregate 0's and 1's in an array

 Given an array of 0's and 1's in a random order.
 Write a code to segregate 0's on the left
 and 1's on the right side of the array.
 
 Input arr = [0,1,0,1,0,0,1];
 Output arr = [0,0,0,0,1,1,1];
 
 */
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {0,1,0,1,0,0,1,0,1,1,0};
		int[] newarr = new int[arr.length];
		int start = 0, end = arr.length-1;
		int index = 0;
		
		while(index<arr.length-1) {
			if(arr[index] == 0) {
				newarr[start] = arr[index];
				index++;
				start++;
			}else if(arr[index] == 1) {
				newarr[end] = arr[index];
				index++;
				end--;
			}
		}
		for (int i : newarr) {
			System.out.print(i+" ");
		}
	}
}
