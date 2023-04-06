package INhertance;

public class reverses {

	public static void main(String[] args) {

		String str = "pritesh", beat = " ";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			System.out.println(ch);
			beat = ch + beat; // adds each character in front of the existing string
			System.err.println(beat);
		}
		System.out.println("Reversed word: " + beat);
	}
}
