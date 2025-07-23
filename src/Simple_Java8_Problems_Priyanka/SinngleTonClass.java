package Simple_Java8_Problems_Priyanka;


class test{
    
	private static test sam;

    static {
    	sam=new test();
    }
    
    public void display() {
    	System.out.println("SingleTon");
    }
     
    public static test function() {
        return sam;
    }
    
}

public class SinngleTonClass {
public static void main(String[] args) {
	 test.function().display();
	 System.out.println(test.function());
	 System.out.println(test.function());
	}
}
