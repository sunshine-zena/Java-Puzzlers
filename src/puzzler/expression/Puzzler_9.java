package puzzler.expression;

/**
 * 9、半斤     10、八两
 * @author dulijuan
 *
 */
public class Puzzler_9 {

	public static void main(String[] args) {
		short x = 0;
		int i = 123456;
		x += i;
		System.out.println(x);
		
		Object o = "buy ";
		String s = "Effective java";
		//o += s;
		o = o + s;
		System.out.println(o);
		
		System.out.println('H' + 'a');
		System.out.println("" + 'H' + 'a');
		System.out.printf("%c%c", 'H', "a");
		
	}
}
