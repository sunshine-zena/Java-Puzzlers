package puzzler.exception;

/**
 * 40、不情愿的构造器
 *
 */
public class Reluctant_40 {
	
	private Reluctant_40 internalInstance = new Reluctant_40();

	public Reluctant_40() throws Exception {
		throw new Exception("I'm not coming out");
	}
	
	public static void main(String[] args) {
		try {
			Reluctant_40 b = new Reluctant_40();
			System.out.println("Surprise!");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("I told you so");
		}
	}
}

/*
 * main 方法调用了Reluctant 构造器，它将抛出一个异常。
 * 你可能期望catch 子句能够捕获这个异常，并且打印I told you so。
 * 凑近仔细看看这个程序就会发现，Reluctant 实例还包含第二个内部实例，它的构造器也会抛出一个异常。
 * 无论抛出哪一个异常，看起来main 中的catch 子句都应该捕获它，因此预测该程序将打印I told you 应该是一个安全的赌注。
 * 但是当你尝试着去运行它时，就会发现它压根没有去做这类的事情：它抛出了StackOverflowError 异常，为什么呢？
 * 与大多数抛出StackOverflowError 异常的程序一样，本程序也包含了一个无限递归。
 * 当你调用一个构造器时，实例变量的初始化操作将先于构造器的程序体而运行[JLS 12.5]。
 * 在本谜题中， internalInstance 变量的初始化操作递归调用了构造器，而该构造器通过再次调用Reluctant 构造器而初始化该变量自己的internalInstance 域，如此无限递归下去。
 * 这些递归调用在构造器程序体获得执行机会之前就会抛出StackOverflowError 异常，因为StackOverflowError是Error 的子类型而不是Exception 的子类型，所以catch 子句无法捕获它。
 
 * 对于一个对象包含与它自己类型相同的实例的情况，并不少见。例如，链接列表节点、树节点和图节点都属于这种情况。
 * 你必须非常小心地初始化这样的包含实例，以避免StackOverflowError 异常。
 *
 */