import java.lang.*;
import java.util.*;


class Experiment {
	public static void main(String[] args){
		int a = 10;
		change(a);
		System.out.println(a);

		int[] b = {1, 3};
		change(b);
		System.out.println(Arrays.toString(b));
	}

	static void change(int x){
		x++;
	}

	static void change(int[] x){
		x[0]+=1;
	}
}
