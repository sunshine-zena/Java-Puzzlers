package puzzler.foreach;

/**
 * 26、循环中
 * 程序本身想要输出的结果是:101
 */
public class InTheLoop_26 {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = START; i <= END; i++)
			count++;
		System.out.println(count);

	}
}
