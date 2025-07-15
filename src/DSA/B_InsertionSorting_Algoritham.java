package DSA;

import java.util.Arrays;

public class B_InsertionSorting_Algoritham {// large number to the j index
public static void main(String[] args) {
	int[] arr= {1,3,2,5,4};
	for(int i=1;i<arr.length;i++) {
		for(int j=i;j>0;j--) {
			if (arr[j-1]>arr[j]){//swapping 1>3
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
