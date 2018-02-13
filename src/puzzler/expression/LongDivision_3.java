package puzzler.expression;

/**
 * 2、长整除
 *
 */
public class LongDivision_3 {

	public static void main(String[] args) {
		division1();
		division2();
	}
	
	public static void division1() {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY  = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY + "/" + MILLIS_PER_DAY + "=" + MICROS_PER_DAY/MILLIS_PER_DAY);
	}
	
	public static void division2() {
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY  = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY + "/" + MILLIS_PER_DAY + "=" + MICROS_PER_DAY/MILLIS_PER_DAY);
	}
}
