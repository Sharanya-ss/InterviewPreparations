package Java8Interview_questions;

public class AplleQuestion {
	public static void main(String[] args) {
        int arr[] = {8, 9, 5, 11, 6, 1, 7, 6};
        // output = 11, 11, 11, 11, 7, 7, -1, -1
        int maxFromRight = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        int temp;

        for (int i = arr.length - 2; i >= 0; i--) {
            temp = arr[i];
            arr[i] = maxFromRight;
            if (temp > maxFromRight) {
                maxFromRight = temp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
