package Interview;

class Tree {
	public int x;
	public Tree l;
	public Tree r;
	
	public Tree(int i, Tree le, Tree ri){
		x =i;
		l = le;
		r = ri;
	}
}
