package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;


public class TripPlanning {

	private HashMap<Integer,Boolean> visited;
	private HashSet<Integer> toVisit;
	private int unvisited;

	public int[] solution(int K, int[] T) {
		// write your code in Java SE 7
		visited = new HashMap<Integer,Boolean>();
		HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
		toVisit = new HashSet<Integer>();
		visited.put(K,true);
		for(int i = 0; i< T.length ; i++){
			HashSet<Integer> set = map.get(i);
			HashSet<Integer> set2 = map.get(T[i]);
			if(set == null){
				set = new LinkedHashSet<Integer>();
			}
			if(set2 == null){
				set2 = new LinkedHashSet<Integer>();
			}
			set.add(T[i]);
			set2.add(i);
			map.put(i,set);
			map.put(T[i],set2);
			if(i != K){
				toVisit.add(i);
			}
		}
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		tmp.add(K);
		int start = K;
		while(toVisit.size() != 0){
			int result = -1; 
			int[] iterationVisited = null;
			int iterationUnvisited = -1;
			for(int i:toVisit){
				int[] tmpVisited = findLongestPath(map,start,i);
				if(iterationVisited == null){
					result = i;
					iterationVisited = tmpVisited;
					iterationUnvisited = unvisited;
				}else {
					if(unvisited > iterationUnvisited ||
							(unvisited > iterationUnvisited && i < result)){
						result = i;
						iterationVisited = tmpVisited;
						iterationUnvisited = unvisited;
					}
				}
			}
			tmp.add(result);
			for(int i= 0;i<iterationVisited.length; i++){
				toVisit.remove(iterationVisited[i]);
			}
			iterationVisited = null;
			start = result;
			result = -1;

		}
		int size = tmp.size();
		int[] out = new int[size];
		for(int i= 0;i<size; i++){
			out[i] = tmp.get(i);
		}
		return out;
	}

	public int[] findLongestPath(HashMap<Integer, HashSet<Integer>> map, int start, int finish){
		unvisited = -1;
		//System.out.println("findLongestPath ( "+ start + " , " + finish+ " )");
		HashMap<Integer,Boolean> visited = new HashMap<Integer, Boolean>();
		Queue<Integer> q=new LinkedList<Integer>();
		Queue<ArrayList<Integer>> pathQ = new LinkedList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> current = new ArrayList<Integer>();

		current.add(start);
		pathQ.add(current);

		q.add(start);
		visited.put(start, true);

		while(!q.isEmpty())
		{
			int n = q.remove();
			if(n == -1){
				@SuppressWarnings("unused")
				int o=1;
			}
			Integer child=null;
			current = pathQ.remove();
			while((child=getUnvisitedChildNode(map,visited,n))!=null)
			{	
				visited.put(child, true);
				if(child == -1){
					@SuppressWarnings("unused")
					int o=1;
				}
				q.add(child);
				ArrayList<Integer> now = new ArrayList<Integer>(current);
				now.add(child);
				if(child == finish){
					//save path to here
					ArrayList<Integer> t = new ArrayList<Integer>(now);
					paths.add(t);
				}
				pathQ.add(now);	
			}
		}
		int max = -1;
		ArrayList<Integer> maxList = null;
		for(ArrayList<Integer> p : paths){
			int count = unvisited(p);
			if(max < count){
				max= count;
				maxList = p;
			}
		}
		unvisited = max;
		int size = maxList.size();
		int[] out = new int[size]; 
		for(int i= 0;i<size; i++){
			out[i] = maxList.get(i);
		}
		return out;
	}

	private int unvisited(ArrayList<Integer> p) {
		int tmp = 0;
		if(p.size() < toVisit.size()){
			for(int a: toVisit){
				if(p.contains(a)){
					tmp++;
				}
			}
		}else {
			for(int a: p){
				if(toVisit.contains(a)){
					tmp++;
				}
			}
		}
		return tmp;
	}

	private Integer getUnvisitedChildNode(
			HashMap<Integer, HashSet<Integer>> map, HashMap<Integer, Boolean> visited, Integer n) {
		HashSet<Integer> i = map.get(n);
		//System.out.println(n);
		for(int o:i){
			Boolean isVisited = visited.get(o); 
			if(isVisited == null){
				return o;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TripPlanning s = new TripPlanning();
		int[] a = {1,2,3,3,2,1,4};
		int[] out = s.solution(2,a);
		for(int i:out){
			System.out.print(i +",");
		}
	}

}
