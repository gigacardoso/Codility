package Interview;

public class Solution2 {

	public int solution(int[] A) {
        // write your code in Java SE 8
		int decimal = 0;
		for (int i = 0; i < A.length; i++) {
			decimal += A[i] * java.lang.Math.pow(8,i);
		}
		return countBitsSet(decimal);
    }
	
	int countBitsSet(int dec)
	{
	    int count = 0;
	    while (dec != 0){
	      dec &= (dec-1) ;
	      count++;
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] a = {1,5,6};
		System.out.println(s.solution(a));
	}

}
