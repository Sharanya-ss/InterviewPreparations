package Simple_Java8_Problems_Priyanka;

public class Epsilon {
	
	public static void main(String[] args) {
		double d1=0.3;
		double d2=0.2+0.1;
		//System.out.println(Math.abs(d2-d1));
		double epsilon=1e-9;
		if(Math.abs(d2-d1)<epsilon)
			System.out.println(true);
		else 
			System.out.println(false);
		
			
	}

}
