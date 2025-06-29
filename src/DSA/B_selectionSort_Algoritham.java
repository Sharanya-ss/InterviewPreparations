package DSA;

import java.util.Arrays;

public class B_selectionSort_Algoritham {
	public static void main(String[] args) {
		int[] arr= {2,1,4,5,3};
		//smaller elements will start reaching the front side of array for every iteration
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {// swapping condition 
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
