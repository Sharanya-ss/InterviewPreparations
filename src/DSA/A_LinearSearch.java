package DSA;

public class A_LinearSearch {
	public static void main(String[] args) {
		int target=9;
		int[] arr= {1,9,2,4,5};
		for(int i=0;i<arr.length;i++) { // time complexity o(n)
			if(arr[i]==target) {
				System.out.println(String.format("index %d is %d", 9,i));
				break;
			}
		}
	}

}
