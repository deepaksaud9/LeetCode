package string;

/** 

	Segregate 0's and 1's in an array

 Given an array of 0's and 1's in a random order.
 Write a code to segregate 0's on the left
 and 1's on the right side of the array.
 
 Input arr = [0,1,0,1,0,0,1];
 Output arr = [0,0,0,0,1,1,1];
 
 */

public class Segregate {

	public static void main(String[] args) {
		int[] arr = new int[] {0,1,0,1,0,0,1,0,1,1,0};
		int[] newarr = new int[arr.length];
		int j=0;
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==0) {
				arr[j++]=arr[i];
			}
		}
		
		while(j<arr.length) {
			arr[j++] = 1;
		}
		
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}
	
}
