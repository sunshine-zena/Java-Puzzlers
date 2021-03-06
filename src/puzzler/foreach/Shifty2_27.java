package puzzler.foreach;

public class Shifty2_27 {	

	/**
	 * 幸运的是，有一个非常容易的方式能够订正该问题。
	 * 我们不是让-1 重复地移位不同的移位长度，而是将前一次移位操作的结果保存起来，并且让它在每一次迭代时都向左再移 1 位。
	 * 下面这个版本的程序就可以打印出我们所期望的 32：
	 */
	public static void main(String[] args) {
		int distance = 0;
		for (int val = -1; val != 0; val <<= 1)
			distance++;
		System.out.println(distance);
	}
	
	/**
	 * 前面提到的移位操作符的行为还有另外一个令人震惊的结果。很多程序员都希望具有负的移位长度的右移操作符可以起到左移操作符的作用，反之亦然。
	 * 但是情况并非如此。右移操作符总是起到右移的作用，而左移操作符也总是起到左移的作用。
	 * 负的移位长度通过只保留低 5 位而剔除其他位的方式被转换成了正的移位长度——如果左操作数是 long 类型的，则保留低 6 位。
	 * 因此，如果要将一个 int数值左移，其移位长度为-1，那么移位的效果是它被左移了 31 位   ???????????
	 */

}
