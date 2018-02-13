package puzzler.charPuzzler;

import java.util.regex.Pattern;
/**
 * 20、我是什么类？
 */
public class Me_20 {
	public static void main(String[] args){
		System.out.println(
		Me_20.class.getName().
			replaceAll(".", "/") + ".class");
			//replaceAll("\\.", "/") + ".class");
			//replaceAll(Pattern.quote("."),"/") + ".class");
	}
}

