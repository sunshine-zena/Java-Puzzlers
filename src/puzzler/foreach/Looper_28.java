package puzzler.foreach;

public class Looper_28 {

	public static void main(String[] args) {
		//looper1();
		//looper2();
	}
	
	//设置变量，使循环编程无线循环
	public static void looper1() {
		int start = Integer.MAX_VALUE - 1;

		for (int i = start; i <= start + 1; i++) {}

		System.out.println("---end---");
	}
	
	//设置变量，使循环编程无线循环
	public static void looper2() {
		//double i = 1.0 / 0.0;
		//double i = Double.POSITIVE_INFINITY;
		double i = 1.0e40;
		//System.out.println("i:" + i);
		while(i == i + 1) {}
	}
	
	/*
	 * 浮点数操作返回的是最接近其精确的数学结果的浮点数值。一旦毗邻的浮点数值之间的距离大于 2，那么对其中的一个浮点数值加 1 将不会产生任何效果，
	 * 因为其结果没有达到两个数值之间的一半。对于 float 类型，加 1 不会产生任何效果的最小级数是 225 ，即 33,554,432；
	 * 而对于 double 类型，最小级数是 254 ，大约是 1.8 × 1016 。
	 * 毗邻的浮点数值之间的距离被称为一个 ulp，它是“最小单位（unit in the lastplace）”的首字母缩写词。
	 * 在 5.0 版中，引入了 Math.ulp 方法来计算 float或 double 数值的 ulp。
	 */
}
