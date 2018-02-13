package puzzler.foreach;

/**
 * 24、尽情享受每一个字节
 *
 */
public class BigDelight_24 {

	public static void main(String[] args) {
		for(Byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			//System.out.println("b:" + b);
			if(b == 0x90) {
				System.out.println("Joy!");
			}
			/*if(b == (byte)0x90) {
				System.out.println("Joy!");
			}
			//可以用一个屏蔽码来消除符号扩展的影响
			if((b & 0xFF) == 0x90) {
				System.out.println("Joy！！");
			}*/
		}
		
		//byte by = (byte)0x90;
		//int a = 0x90;
		//System.out.println("by:" + Integer.valueOf(by) + ", a=" + a);
		
		/*
		 * byte是有符号数，将byte的0x90转成整型，是-112
		 * 因为 byte 是一个有符号类型，所以这个转换执行的是符号扩展，将负的 byte 数值提升为了在数字上相等的 int 数值。
		 * 在本例中，该转换将(byte)0x90 提升为 int 数值-112，它不等于 int 数值 0x90，即+144
		 */
	}
}
