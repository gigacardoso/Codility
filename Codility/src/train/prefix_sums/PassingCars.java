package train.prefix_sums;

public class PassingCars {

	public int solution1(int[] A) {
        // write your code in Java SE 8
		int cars= 0;
		for (int i = 1; i < A.length; i++) {
			A[i] = A[i-1] + A[i];
		}
		int sum = A[A.length-1];
		int last = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == last){
				cars += sum - A[i];
			}
			last = A[i];
		}
		return cars;
    }
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int cars= 0;
		int zeros = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0){
				zeros++;
			}else{
				cars += zeros;
			}
		}
		if(cars > 1e9 || cars < 0) return -1;
		return cars;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingCars p = new PassingCars();
		int[] a = {0,1,0,1,1};
		System.out.println(p.solution(a));
	}

}
