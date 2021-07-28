import java.lang.*;


class MaskingMerging {

	public static void main(String[] args){
		

		byte a=9, b=12;

		byte c;
		
		c = (byte)(a<<4);
		c = (byte)(c|b);		

		System.out.println(c);

		System.out.println((c&0b11110000)>>4); // getting first 4 bits 
		// System.out.println(5.5f&1); // cannot do this 
	}
}
