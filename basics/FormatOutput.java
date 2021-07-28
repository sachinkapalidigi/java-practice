import java.lang.*;



class FormatOutput {

	public static void main(String[] args){
		int a = -14;
		float b = 153.25f;
		String c = "how are you";
		
		// int : d o x
		// float/ double: f e g
		// string: s
		// char: c

		// %[argument_index$][flags][width][.precision]conversion
		// flags: '-' '+' '0' '' '('
		//  - will put spaces after the value and + flag will show the sign of the number
		System.out.printf("%2$08.3f is float, %1$-5d is integer in 5 width, %1$+5d %1d is positive and %s \n", a, b, c);
	
	}

}
