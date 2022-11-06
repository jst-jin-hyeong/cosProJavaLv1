import java.util.ArrayList;

public class ExamUnionFind2 {
	
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
		for(int i=1; i<6; i++) 
			System.out.print("   "+p.get(i)+ "         ");
		System.out.println();
	}
	
	public static void main(String[] args) { 
	
		
		int[][] connections = new int[][]{{1,2},{1,3},{1,4},{4,5},{1,5}};
		
		//대표 노드 번호를 자신의 노드 번호로 초기화
		for(int i = 0; i < 6 ; i++)
			parentNum.add(i);
		
		for(int i=0; i < connections.length; i++) {  
			//Find 확인해 보기
			for(int j= 1; j < 6 ; j++)
				System.out.print("     f("+j+"): "+ Find(parentNum,j)+" ");
			System.out.println();
			Union(parentNum,connections[i][0],connections[i][1]);
			System.out.print("["+connections[i][0]+","+connections[i][1] + "] ");
			parentPrint(parentNum);
		}
		
	
		
	}
}
