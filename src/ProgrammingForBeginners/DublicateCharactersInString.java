package ProgrammingForBeginners;

public class DublicateCharactersInString {
	public static void main(String[] args) {
        // duplicate characters in string
        String s = "abcabxcyz";
        char[] c = s.toCharArray();
        String result = "";

        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    result += c[j];
                }
            }
        }
        System.out.println(result);
    }

}
