import java.lang.*;


class StringMethods {

	public static void main(String[] args){
		String str = "Welcome to learning java";

		str = str.toLowerCase();
		System.out.println(str);

		System.out.println(str.toUpperCase());


		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));

		System.out.println(str.replace('l', 'z'));
	}

}
