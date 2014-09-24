package train.counting_elements;

public class MaxCounters {

	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int current_max = 0;
		int max_to_write = 0;
        // write your code in Java SE 8
        int[] counters = new int[N];
        for (int i : A) {
			if(i <= N){
				int tmp = counters[i-1];
				if(tmp < max_to_write){
					tmp = max_to_write;
				}
				tmp++;
				if(tmp > current_max){ current_max = tmp; }
				counters[i-1] = tmp;
			}else{
				max_to_write = current_max;
			}
		}
        for (int i = 0; i < counters.length; i++) {
			if(counters[i] < max_to_write){
				counters[i] = max_to_write;
			}
		}
        return counters;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxCounters m = new MaxCounters();
		int[] a = {3, 4, 4, 6, 1, 4, 4};
		a = m.solution(5, a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}

}
