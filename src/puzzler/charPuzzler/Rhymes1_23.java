package puzzler.charPuzzler;

import java.util.Random;

public class Rhymes1_23 {

	final static Random rnd = new Random();
	public static void main(String[] args) {
		StringBuffer word = null;
		switch(rnd.nextInt(3)) {
			case 1 :
				word = new StringBuffer("P");
				break;
			case 2:
				word = new StringBuffer("G");
				break;
			default:
				word = new StringBuffer("M");
				break;
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}
}
