package puzzler.charPuzzler;

import java.util.Random;

/**
 * 23、不劳而获
 * 栅栏柱错误（fencepost error）
 *
 */
public class Rhymes_23 {

	private static Random rnd = new Random();
	public static void main(String[] args) {
		StringBuffer word = null;
		switch(rnd.nextInt(2)) {
			case 1: word = new StringBuffer('P');
			case 2: word = new StringBuffer('G');
			default: word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}
	/*乍一看，这个程序可能会在一次又一次的运行中，以相等的概率打印出 Pain，Gain 或 Main。
	 * 看起来该程序会根据随机数生成器所选取的值来选择单词的第一个字母：0 选 M，1 选 P，2 选 G。
	 * 谜题的题目也许已经给你提供了线索，它实际上既不会打印 Pain，也不会打印 Gain。
	 * 也许更令人吃惊的是，它也不会打印 Main，并且它的行为不会在一次又一次的运行中发生变化，它总是在打印 ain。
	 * 有三个 bug 凑到一起引发了这种行为。你完全没有发现它们吗？
	 * 
	 * 第一个 bug 是所选取的随机数使得 switch 语句只能到达其三种情况中的两种。
	 * Random.nextInt(int)的规范描述道：“返回一个伪随机的、均等地分布在从 0（包括）到指定的数值（不包括）之间的一个 int 数值”[Java-API]。
	 * 这意味着表达式 rnd.nextInt(2)可能的取值只有 0 和 1，Switch 语句将永远也到不了 case2 分支，这表示程序将永远不会打印 Gain。nextInt 的参数应该是 3 而不是 2。
	 * 
	 * 第二个bug case后面没有break，所有无论是否执行case 1，都会被default覆盖
	 * 
	 * 第三个bug 也是最微妙的一个 bug 是表达式 new StringBuffer('M')可能没有做哪些你希望它做的事情。
	 * 你可能对 StringBuffer(char)构造器并不熟悉，这很容易解释：它压根就不存在。StringBuffer 有一个无参数的构造器，
	 * 一个接受一个 String 作为字符串缓冲区初始内容的构造器，以及一个接受一个 int 作为缓冲区初始容量的构造器。
	 * 在本例中，编译器会选择接受 int 的构造器，通过拓宽原始类型转换把字符数值'M'转换为一个 int 数值 77[JLS 5.1.2]。
	 * 换句话说，new StringBuffer('M')返回的是一个具有初始容量 77 的空的字符串缓冲区。
	 * 该程序余下的部分将字符 a、i 和 n 添加到了这个空字符串缓冲区中，并打印出该字符串缓冲区那总是 ain 的内容。
	 * 
	 */

	
	/*
	 * 总结一下：首先，要当心栅栏柱错误。
	 * 其次，牢记在 switch 语句的每一个 case中都放置一条 break 语句。
	 * 第三，要使用常用的惯用法和 API，并且当你在离开老路子的时候，一定要参考相关的文档。
	 * 第四，一个 char 不是一个 String，而是更像一个 int。
	 * 最后，要提防各种诡异的谜题。
	*/

}
