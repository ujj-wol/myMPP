package lab6.prob2;

public class MyUtility {
	protected static String countLetters(String input) {
		Integer length = (Integer) input.length();
		return length.toString();
	}

	protected static String reverseLetters(String input) {
		StringBuilder str = new StringBuilder(input);
		return str.reverse().toString();
	}

	protected static String removeDuplicates(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			String ch = ((Character) input.charAt(i)).toString();
			if (output.indexOf(ch) < 0) {
				output = output + ch;
			}
		}

		return output;
	}
}
