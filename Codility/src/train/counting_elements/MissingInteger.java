package train.counting_elements;

import java.util.HashMap;

public class MissingInteger {

	public int solution(int[] A) {
		HashMap<Integer,Boolean> seen = new HashMap<Integer, Boolean>();
		int min = 1;
		for (int i = 0; i < A.length; i++) {
			if(A[i]<= 0){ continue;}
			if(A[i] == min){
				boolean c = true;
				while(c){
					min++;
					if(seen.get(min) == null){
						c = false;
					}
				}
			}
			seen.put(A[i], true);
		}
		return min;
    }
	
	public static void main(String[] args) {
		MissingInteger m = new MissingInteger();
		int[] a = {1, 3, 6, 4, 1, 2};
		System.out.println(m.solution(a));
	}

}
