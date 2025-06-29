package DSA;

import java.util.Arrays;

public class B_QuickSort_Algoritham {
	public static void QuickSort(int[] arr, int l,int h) {
		if(l>=h) {
			return;
		}
		int start=l;
		int end=h;
		int mid=(start+end)/2;
		int pivot=arr[mid];
		
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(pivot<arr[end]) {
				end--;
			}
			if(start<=end) {//swapping logic
				int temp=arr[start];
			    arr[start]=arr[end];
			    arr[end]=temp;
			    start++;
			    end--;
			}
		}
		
		//recurrsive logic
		QuickSort(arr, l, end); // end index will be less than mid index
		QuickSort(arr, start, h);//start index will be more than mid index
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,2,5,4};
		int l=0;//start index
		int h=arr.length-1;//end index
		QuickSort(arr, l, h);
		System.out.println(Arrays.toString(arr));
	}

}
