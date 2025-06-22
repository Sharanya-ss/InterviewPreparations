package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTwoListFindthecommanvalues {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,8,6));
		List<Integer> iist2=List.of(1,2,3,8,4,7);
		list1.removeAll(iist2);
		list1.sort(null);
		System.out.println(list1);
	}

}
