import java.util.ArrayList;

public class ExamUnionFind {
	
	static ArrayList<Integer> parentNum = new ArrayList<Integer>();
	
	private static int Find(ArrayList<Integer> parent, int u) {
		if (u == parent.get(u))
			return u;
		else
			return Find(parent,parent.get(u));
	}
	
	private static void Union(ArrayList<Integer> parent, int u, int v) {
		int u_parent = Find(parent, u);	
		int v_parent = Find(parent, v);
		
		parent.set(u_parent, v_parent);
	}
	
	private static void parentPrint(ArrayList<Integer> p) {
		for(int i=1; i <= 4; i++) 
			System.out.print(p.get(i)+ " ");
		System.out.println();
	}
	
	public static void main(String[] args) { 
		parentNum.add(0);
	    
		//대표 노드 번호를 자신의 노드 번호로 초기화
		for(int i = 1; i <= 4 ; i++)
			parentNum.add(i);
		
		//union[1,2] 수행
		Union(parentNum,1,2);
		parentPrint(parentNum);
		
		//Find(1) 확인해 보기
		System.out.println("find(1): "+ Find(parentNum,1));
		
		//union[1,3] 수행
		Union(parentNum,1,3);
		parentPrint(parentNum);
		
		//Find(1) 확인해 보기
		System.out.println("find(1): "+ Find(parentNum,1));
		
	}
}
