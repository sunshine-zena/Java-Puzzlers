package puzzler.exception;

/**
 * 37、极端不可思议
 *
 */
public class Arcane3_37 implements Type3 {
	public void f() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		Type3 t3 = new Arcane3_37();
		t3.f();
	}
}

interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}
