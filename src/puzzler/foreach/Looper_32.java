package puzzler.foreach;

/**
 * 32、循环者的诅咒
 *
 */
public class Looper_32 {
	
	public static void main(String[] args) {

		Integer i = new Integer(0);
		Integer j = new Integer(0);
		
		//System.out.println(new Integer(0) == new Integer(0));
		//System.out.println(new Integer(0) == 0);


		while (i <= j && j <= i && i != j) {
		}

	}
	
	/*
	 * 实数上的≤关系是反对称的。Java 的<=操作符在 5.0 版之前是反对称的，但是这从 5.0 版之后就不再是了。
	 * <=操作符在这些类型的操作数上不是反对称的，因为 Java 的判等操作符（==和!=）在作用于对象引用时，执行的是引用ID 的比较，而不是值的比较。

	 * 
	 */
}
