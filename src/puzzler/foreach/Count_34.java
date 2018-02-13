package puzzler.foreach;

/**
 * 34、被计数器击倒了
 *这个谜题寓意很简单：不要使用浮点数作为循环索引，因为它会导致无法预测的行为。
 */
public class Count_34 {

	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0;
		for (float f = START; f < START + 50; f++)
			count++;
		System.out.println(count);

	}
	
	/*
	 * f 的初始值太大了，以至于在对其加上 50，然后将结果转型为 float 时，所产生的数值等于直接将 f 转换成 float 的数值。
	 * 换句话说，(float)2000000000 ==2000000050，因此表达式 f < START + 50 即使是在循环体第一次执行之前就是false，
	 * 所以，循环体也就永远的不到机会去运行。

	 */
}
