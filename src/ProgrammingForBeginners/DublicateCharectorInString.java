package ProgrammingForBeginners;

public class DublicateCharectorInString {
	public static void main(String[] args) {
        String[] s = "abcabcghh".split("");
        String dublicate = "";
        String result = "";

        for (String ss : s) {
            if (!dublicate.contains(ss)) {
                dublicate += ss; // without duplicated
            } else {
                result += ss; // duplicate string
            }
        }

        System.out.println(result);
    }
}
