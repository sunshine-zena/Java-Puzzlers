package puzzler.foreach;

/**
 * 32、循环者遇到了狼人
 *
 */
public class Looper_33 {

	public static void main(String[] args) {
		//int i = Integer.MIN_VALUE;
		Long i = Long.MIN_VALUE;

		while (i != 0 && i == -i) {
		}

	}
	
	/*
	 * Java 使用 2 的补码的算术运算，它是非对称的。
	 * 对于每一种有符号的整数类型（int、long、byte 和 short），负的数值总是比正的数值多一个，
	 * 这个多出来的值总是这种类型所能表示的最小数值。对 Integer.MIN_VALUE 取负值得到的还是它没有改变过的值，
	 * Long.MIN_VALUE 也是如此。对 Short.MIN_VALUE取负值并将所产生的 int 数值转型回 short，返回的同样是最初的值（Short.MIN_VALUE）。
	 * 对 Byte.MIN_VALUE 来说，也会产生相似的结果。更一般地讲，千万要当心溢出：就像狼人一样，它是个杀手。

	 */
}
