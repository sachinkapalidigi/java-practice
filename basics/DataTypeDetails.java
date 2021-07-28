import java.lang.*;


public class DataTypeDetails {
	public static void main(String[] args){
		
		int x = 5;
		int y = -5;

		System.out.println(Integer.toBinaryString(x));

		System.out.println(Integer.toBinaryString(y));

		System.out.println(Long.toBinaryString(10L));

		float f = 'c';
		System.out.println(f);

		// Max ad Min values

		System.out.println("Max value of float, double, integer "+Float.MAX_VALUE+" "+Double.MAX_VALUE+" "+Integer.MAX_VALUE);

	}

}
