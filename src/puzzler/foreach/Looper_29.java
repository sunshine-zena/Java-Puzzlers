package puzzler.foreach;

/**
 * 29、循环的新娘
 */
public class Looper_29 {

	public static void main(String[] args) {
		//double i = 0.0 / 0.0;
		double i = Double.NaN;

		System.out.println(i - i == 0);
		
		while (i != i) {
		}

	}
}
