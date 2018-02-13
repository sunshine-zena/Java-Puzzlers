package puzzler.exception;

import java.io.IOException;

/**
 * 37、极端不可思议
 *
 */
public class Arcane1_37 {

	/*
	 * 这个程序不能编译，因为println 方法没有声明会抛出任何被检查异常，而IOException 却正是一个被检查异常。
	 * 语言规范中描述道：如果一个catch 子句要捕获一个类型为E 的被检查异常，而其相对应的try 子句不能抛出E 的某种子类型的异常，那么这就是一个编译期错误[JLS 11.2.3]。
	 */
	public static void main(String[] args) {
		/*try {
			System.out.println("Hello world");
		} catch(IOException e) {
			System.out.println("I've never seen println fail!");
		}*/
	}

}
