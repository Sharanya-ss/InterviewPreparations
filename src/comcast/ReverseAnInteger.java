package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReverseAnInteger {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,21,12,122,133);
		/*
		 * l.forEach(n->{ int temp=n; while(n>1) { n=n/10; } if(n!=1) {
		 * System.out.println(temp); } });
		 */
	Predicate<Integer>	p=n->{while(n>1) { 
			n=n/10; }
		return n==1;
		};
	
	l.stream().filter(i->p.test(i)).forEach(System.out::println);
		
	}

}
