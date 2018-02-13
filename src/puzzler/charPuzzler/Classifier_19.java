package puzzler.charPuzzler;

/**
 * 19、漂亮火花
 *
 */
public class Classifier_19 {

	public static void main(String[] args) {
		System.out.println(
		classify('n') + classify('+') + classify('2'));
	}
	static String classify(char ch) {
		if ("0123456789".indexOf(ch) >= 0)
		return "NUMERAL ";
		if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
		return "LETTER ";
//		/* (Operators not supported yet)
//		if ("+-*/&|!=" >= 0)
//		return "OPERATOR ";
//		*/
		return "UNKNOWN";
	}

}
