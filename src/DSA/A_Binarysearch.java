package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A_Binarysearch {// time complexity log(n)
  public static void main(String[] args) {
	int target=5;
	int[] arr= {5,1,2,3,4};
	//For binary search Array need to be sorted first
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	//logic starts
	int start_index=0;
	int end_index=arr.length-1;
	
	while(start_index<=end_index) {// start should be always less than ending
		int mid=(start_index+end_index)/2;
		if (target<arr[mid]) {
			 end_index=mid-1;
		} else if(target>arr[mid]){//5>3
             start_index=mid+1;
		}else {
			System.out.println("targtet index of "+target+" is : "+mid);
			break;
		}
	}
}
}
