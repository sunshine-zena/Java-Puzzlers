package puzzler.foreach;

/**
 * 25、无情的增量操作
 *
 */
public class Increment_25 {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
			j = j++;
		System.out.println(j);

	}
	/*
	int tmp = j;
	j = j + 1;
	j = tmp;
	*/
}
