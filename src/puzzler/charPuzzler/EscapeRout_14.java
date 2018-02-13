package puzzler.charPuzzler;

/**
 * 14、转义字符的崩溃
 */
public class EscapeRout_14 {

	public static void main(String[] args) {
		// \u0022 是双引号的 Unicode 转义字符
		System.out.println("a\u0022.length()+\u0022b".length());
		
		//Unicode 转义字符每一个在源文件中都需要用 6 个字符来表示，但是它们只表示字符串中的一个字符
		/**
		 * Java 对在字符串字面常量中的 Unicode 转义字
符没有提供任何特殊处理。编译器在将程序解析成各种符号之前，先将 Unicode
转义字符转换成为它们所表示的字符[JLS 3.2]。因此，程序中的第一个 Unicode
转义字符将作为一个单字符字符串字面常量（"a"）的结束引号，而第二个
Unicode 转义字符将作为另一个单字符字符串字面常量（"b"）的开始引号。程
序打印的是表达式"a".length()+"b".length()，即 2。

\u0022对应的字符为英文的双引号",所以上面的语句等同于：
System.out.println("a".length()+"b".length());
		 */
	}
}
