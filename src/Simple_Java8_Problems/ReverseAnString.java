package Simple_Java8_Problems;

public class ReverseAnString {
	public static void main(String[] args) {
        String name = "Antony";
        String rev = "";
        for (int i = 0; i < name.length(); i++) {
            rev = name.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
