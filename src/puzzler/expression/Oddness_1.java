package puzzler.expression;

/**
 * 2、奇数性
 *
 */
public class Oddness_1 {

	public static void main(String[] args) {

		int[] array = new int[] {13, -11, 5, 6, -20};
		for (int a : array) {
			//System.out.println(a + ":" + isOdd(a) );
			//System.out.println(a + ":" + isOdd2(a) );
			System.out.println(a + ":" + isOdd3(a) );
		}
	}
	

	public static boolean isOdd(int i){//负整数都是false，负偶数%2=0；负奇数%2=-1
		return i % 2 == 1;
	}
	

	public static boolean isOdd2(int i){
		return i % 2 != 0;
	}
	

	public static boolean isOdd3(int i){
		return (i & 1) != 0;
	}
}
