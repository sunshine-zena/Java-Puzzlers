package puzzler.exception;

/**
 * 37、极端不可思议
 *
 */
public class Arcane2_37 {
	/*
	 * 看起来应该是不可以编译的，但是它却可以。它之所以可以编译，是因为它唯一的catch 子句检查了Exception。
	 * 尽管JLS 在这一点上十分含混不清，但是捕获Exception 或Throwble 的catch 子句是合法的，不管与其相对应的try 子句的内容为何。尽
	 */
	public static void main(String[] args) {
		try {
			// If you have nothing nice to say, say nothing
			//System.out.println("This can happen");
		} catch(Exception e) {
			System.out.println("This can't happen");
		}
	}
}

