package Java8Interview_questions;

public class kadanes_Algoritham {
	public static void main(String[] args) {
        int arr[] = {8, 9, -1, 1, 6, 5, 7, -6};
        int max = arr[0];
        int globalmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                max = 0;
            } else {
                max += arr[i];
            }
            if (globalmax < max) {
                globalmax = max;
            }
        }
        System.out.println(globalmax);
    }
}
