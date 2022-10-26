

public class ExamGraphDFS2 {
   
	public static int[][] graph  = new int[][]{
			{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };
	    
    public static boolean[] visited = new boolean[graph.length];  
    
	public static void DFS(int nodeIdx) {
		
		visited[nodeIdx]=true;            //1�� ��� �湮���� ǥ��	
		System.out.print(nodeIdx+" ");    //�湮�� ��� ��ȣ ����ϱ�
		
		//���� ������ ��� ã��
		for (int nextNode: graph[nodeIdx]) {		
			if (!visited[nextNode])       //�湮�� ���� ������ ���ȣ��(DFS)
					DFS(nextNode);
			}
	}
	
	public static void main(String[] args) {
		//1�� ��忡�� ����
	   DFS(1);
	}
}

	