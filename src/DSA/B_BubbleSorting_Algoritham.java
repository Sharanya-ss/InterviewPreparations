package DSA;

import java.util.Arrays;

public class B_BubbleSorting_Algoritham {// large elements will sent to last for every iteration
public static void main(String[] args) {
	int[] arr= {6,3,2,5,4};
	for(int i=1;i<=arr.length;i++) {//outer loop will start from i=1
		for(int j=0;j<arr.length-i;j++) {
			//swapping condition
			if(arr[j]>arr[j+1]) {
				int temp=arr[j+1]; 
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
