package train.counting_elements;

public class PermCheck {

	// you can also use imports, for example:
	// import java.util.*;

	// you can use System.out.println for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public int solution1(int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		int expected = size*(size+1)/2;
		int real = 0;
		for (int i : A) {
			real += i; 
		}
		if(expected == real){
			return 1;
		}else{
			return 0;
		}
	}

	public int solution(int[] A) {
		// write your code in Java SE 8

		int n = A.length;
		boolean[] check = new boolean[n];
		for (int i : A) {
			if(i>n || i < 1){
				return 0;
			}
			if(check[(i-1)]){
				return 0;
			}else{
				check[(i-1)] = true;
			}
		}
		return 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 1, 1, 2};
		PermCheck p = new PermCheck();
		System.out.println(p.solution(a));
		int[] b = {0, 1, 3};
		System.out.println(p.solution(b));
	}

}
