package puzzler.charPuzzler;

import java.io.UnsupportedEncodingException;

/**
 * 18、字符串奶酪
 *
 */
public class StringCheese_18 {
	public static void main(String[] args) {
		byte bytes[] = new byte[256];
		for (int i = 0; i < 256; i++)
			bytes[i] = (byte)i;
		
		/**
		 * 这里的罪魁祸首就是 String(byte[])构造器。有关它的规范描述道：“在通过
			解码使用平台缺省字符集的指定 byte 数组来构造一个新的 String 时，该新
			String 的长度是字符集的一个函数，因此，它可能不等于 byte 数组的长度。当
			给定的所有字节在缺省字符集中并非全部有效时，这个构造器的行为是不确定
			的”[Java-API]
			
			ISO-8859-1 是唯一能够让该程序按顺序打印从 0 到 255 的整数
			的缺省字符集，它更为大家所熟知的名字是 Latin-1
		 */
		//String str = new String(bytes);
		String str;
		try {
			str = new String(bytes, "ISO-8859-1");
			for (int i = 0, n = str.length(); i < n; i++)
				System.out.println((int)str.charAt(i) + " ");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(java.nio.charset.Charset.defaultCharset());
		
	}
}

