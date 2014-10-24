package Interview;

public class Solution {

	 public int solution(Tree T) {
		 if(T == null){
				return 0;
		}
		 
		 int visible = 0;
		 visible++;
		 visible += findVisible(T.l, T.x);
		 visible += findVisible(T.r, T.x);
		 return visible;
	}
	
	private int findVisible(Tree T, int max) {
		if(T == null){
			return 0;
		}
		int visible = 0;
		if(T.x >= max){
			visible++;
			max = T.x;
		}
		visible += findVisible(T.l, max);
		visible += findVisible(T.r, max);
		return visible;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		Tree t = new Tree(8, new Tree(2, new Tree(8, null, null), new Tree(7, null, null)), new Tree(9, null, null));
		System.out.println(s.solution(t));
	}

}
