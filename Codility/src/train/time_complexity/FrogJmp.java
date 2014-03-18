package train.time_complexity;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		// write your code in Java SE 7
		double a = (double) Y/D; 
		double b = (double) X/D;
		return (int) (Math.ceil(a-b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
