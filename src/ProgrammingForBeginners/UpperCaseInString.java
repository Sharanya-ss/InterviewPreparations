package ProgrammingForBeginners;

public class UpperCaseInString {
	public static void main(String[] args) {
        // find upper case in the String;
        String s = "antonyImmanuelAkash";
        char[] c = s.toCharArray();
        String f = "";
        for (char e : c) {
            if (Character.isUpperCase(e)) {
                f += e;
            }
        }
        System.out.println(f);
    }
}
