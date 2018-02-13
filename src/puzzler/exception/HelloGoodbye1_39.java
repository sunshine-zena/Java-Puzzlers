package puzzler.exception;

public class HelloGoodbye1_39 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		Runtime.getRuntime().addShutdownHook(
			new Thread() {
				public void run() {
					System.out.println("Goodbye world");
				}
		});
		System.exit(0);
	}
}
