import java.lang.*;
import java.util.*;

class Operators {
	public static void main(String[] args){
		
		// areaOfTriangle();
		areaOfTriangleWithSides();
		
	}

	static void areaOfTriangleWithSides() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 3 sides of triangle");

		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();

		scan.close();
		float s = (a+b+c)/2f;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is "+area);
	}

	static void areaOfTriangle(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base of the triangle");
		float base = scan.nextFloat();
		System.out.println("Enter the height of the triangle");

		float height = scan.nextFloat();

		float area = (0.5f) * base * height;
		scan.close();
		System.out.println("The area of triangle is "+area);
	}
}
