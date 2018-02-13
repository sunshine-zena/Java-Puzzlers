package puzzler.charPuzzler;

import java.io.File;
import java.util.regex.Matcher;

/**
 * 21、我是什么类？II
 */
public class MeToo_21 {

	public static void main(String[] args){
		/**
		 * Exception in thread "main" java.lang.IllegalArgumentException: character to be escaped is missing
	at java.util.regex.Matcher.appendReplacement(Matcher.java:809)
	at java.util.regex.Matcher.replaceAll(Matcher.java:955)
	at java.lang.String.replaceAll(String.java:2223)
	at puzzler.MeToo.main(MeToo.java:9)
		 */
		//System.out.println(MeToo.class.getName().
		//		replaceAll("\\.", File.separator) + ".class");
		
		
		/**
		 * String.replaceAll 的第二个参数不是一个普通的字符串，而是一个
替代字符串（replacement string），就像在 java.util.regex 规范中所定义的
那样[Java-API]。在替代字符串中出现的反斜杠会把紧随其后的字符进行转义，
从而导致其被按字面含义而处理了。

		 */
		System.out.println(MeToo_21.class.getName()
				.replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
		
		System.out.println(MeToo_21.class.getName().
				replace('.', File.separatorChar) + ".calss");
		

		}

}
