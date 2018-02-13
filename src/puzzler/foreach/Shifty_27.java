package puzzler.foreach;

/**
 * 27、变化莫测的i值
 *
 */
public class Shifty_27 {

	public static void main(String[] args) {
		int i = 0;
		while (-1 << i != 0)
			i++;
		System.out.println(i);
	}
	
	/*
	 * 三个移位操作符：<<、>>和>>>。移位长度总是介于 0 到
31 之间，如果左操作数是 long 类型的，则介于 0 到 63 之间。这个长度是对 32
取余的，如果左操作数是 long 类型的，则对 64 取余。如果试图对一个 int 数值
移位 32 位，或者是对一个 long 数值移位 64 位，都只能返回这个数值自身的值。
没有任何移位长度可以让一个 int 数值丢弃其所有的 32 位，或者是让一个 long
数值丢弃其所有的 64 位。

	 */

}
