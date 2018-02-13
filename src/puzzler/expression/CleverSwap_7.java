package puzzler.expression;

/**
 * 7、互换内容
 */
public class CleverSwap_7{
	public static void main(String[] args){//在单个的表达式中不要对相同的变量赋值两次
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		//x^= y^= x^= y;
		//System.out.println("x= " + x + "; y= " + y);
		
		int tmp1 = x;
		int tmp2 = y;
		int tmp3 = tmp1 ^ tmp2;
		x = tmp3;
		System.out.println("tmp3:" + tmp3);
		
		y = tmp2 ^ tmp3;
		System.out.println("y:" + y);
		
		x = tmp1 ^ y;
		System.out.println("x:" + x);
	}
}

