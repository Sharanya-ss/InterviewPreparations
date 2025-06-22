package practice;


sealed class Shape permits circle, triangle{
	public double size() {
		return 10.00;
	};
}

//unrestricted  subclassing
sealed class circle extends Shape permits halfcircle{
	public double size() {
		return 100.00;
	};
}

non-sealed class halfcircle extends circle{
	public double size() {
		return 100.00;
	};
}

//triagnle is the last subclass of Shape
final class triangle extends Shape{
	public double size() {
		return 100.00;
	};
}

public class SealedClassesDemo {
	public static void main(String[] args) {
		
	}

}
