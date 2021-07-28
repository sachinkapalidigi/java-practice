import java.lang.*;
import java.util.*;


public class ReadKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hi, may I know your name?");
		String name = sc.nextLine();

		System.out.println("Welcome "+name+", have a wonderful day");
		System.out.println("What is your age?");
		
		int age = sc.nextInt();

		if(age<25){
			System.out.println( age+", you are so ");
		}else if(age >= 25 && age<= 50){
			System.out.println(age+", young yet wise");
		}else {
			System.out.println(age+", and still going, go for the ton");
		}
	
		sc.close();

	}
}
