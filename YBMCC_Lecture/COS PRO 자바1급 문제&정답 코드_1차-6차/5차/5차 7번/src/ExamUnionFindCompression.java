import java.util.ArrayList;

public class ExamUnionFindCompression {
	
	static ArrayList<Integer> parentNum = new ArrayList<Integer>();
	
	private static int FindComp(ArrayList<Integer> parent, int u) {
		if (u == parent.get(u))
			return u;
		else
			parentNum.set(u, FindComp(parent,parent.get(u)));
			return parentNum.get(u);
	}
	
	private static void Union1(ArrayList<Integer> parent, int u, int v) {
		int u_parent = FindComp(parent, u);	
		int v_parent = FindComp(parent, v);
		
		parent.set(u_parent, v_parent);
	}
	
	private static void parentPrint(ArrayList<Integer> p,int n) {
		for(int i=1; i<=n; i++) 
			System.out.print(p.get(i)+ " ");
		System.out.println();
	}
	
	public static void main(String[] args) { 
	

		//int[][] connections = new int[][]{{1,2},{1,3},{1,4},{4,5},{1,5}};
		int[][] connections = new int[][]{{1,2},{1,3},{2,3}};
		//��ǥ ��� ��ȣ�� �ڽ��� ��� ��ȣ�� �ʱ�ȭ
		for(int i = 0; i <= connections.length; i++)
			parentNum.add(i);
	
		parentPrint(parentNum,connections.length);
		
		//union ����
		for(int i=0; i < connections.length; i++) {  
			Union1(parentNum,connections[i][0],connections[i][1]);
			System.out.print(connections[i][0]+"��"+connections[i][1]+"���� ��:");
			parentPrint(parentNum,connections.length);
	    }
				
		//Find Ȯ���� ����
		for(int i = 1; i < connections.length ; i++)
			System.out.println("find("+i+"): "+ FindComp(parentNum,i));
				
		
	}
}
