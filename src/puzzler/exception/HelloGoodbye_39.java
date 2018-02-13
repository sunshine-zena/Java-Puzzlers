package puzzler.exception;

/**
 * 39、您好，再见
 *
 */
public class HelloGoodbye_39 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			System.exit(0);
		} finally {
			System.out.println("Goodbye world");
		}
	}
	
	/*
	 * 不论try语句块的执行是正常地还是意外地结束，finally语句块确实都会执行。
	 * 然而在这个程序中，try 语句块根本就没有结束其执行过程。
	 * System.exit 方法将停止当前线程和所有其他当场死亡的线程。finally 子句的出现并不能给予线程继续去执行的特殊权限。
	 * 当System.exit 被调用时，虚拟机在关闭前要执行两项清理工作。
	 * 首先，它执行所有的关闭挂钩操作，这些挂钩已经注册到了Runtime.addShutdownHook 上。
	 * 这对于释放VM 之外的资源将很有帮助。务必要为那些必须在VM 退出之前发生的行为关闭挂钩。
	 */
}
