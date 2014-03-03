package train.time_complexity;

public class TapeEquilibrium {
	public int solution(int[] A) {
		// write your code in Java SE 7
		long a = 0;
		long b = 0;
		a = A[0]; 
		for(int i = 1; i < A.length; i++){
			b += A[i];
		}
		long max = Math.abs(a-b);
		for(int i = 1; i < A.length-1; i++){
			a += A[i];
			b -= A[i];
			long sum = Math.abs(a-b);
			if(sum < max){
				max = sum;
			}
		}
		return (int) max;
	}
	public static void main(String[] args) {
		TapeEquilibrium s = new TapeEquilibrium();
		int[] A = {3000,1000};
		int i = s.solution(A);
		System.out.println(i);
	}

}
