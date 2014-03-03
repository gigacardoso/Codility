package train.time_complexity;

public class PermMissingElem {

	public static int solution(int[] A) {
		// write your code in Java SE 7
		int[] visited = new int[A.length+1];
		for(int i: A){
			visited[i-1] = 1;
		}
		for(int i= 0;i < visited.length ; i++) {
			if(visited[i] == 0) {
				return i+1;
			}
		}
		return 0;
	}	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
