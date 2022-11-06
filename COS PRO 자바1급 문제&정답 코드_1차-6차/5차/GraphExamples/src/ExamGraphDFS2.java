

public class ExamGraphDFS2 {
   
	public static int[][] graph  = new int[][]{
			{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };
	    
    public static boolean[] visited = new boolean[graph.length];  
    
	public static void DFS(int nodeIdx) {
		
		visited[nodeIdx]=true;            //1번 노드 방문으로 표시	
		System.out.print(nodeIdx+" ");    //방문한 노드 번호 출력하기
		
		//다음 인접한 노드 찾기
		for (int nextNode: graph[nodeIdx]) {		
			if (!visited[nextNode])       //방문한 적이 없으면 재귀호출(DFS)
					DFS(nextNode);
			}
	}
	
	public static void main(String[] args) {
		//1번 노드에서 시작
	   DFS(1);
	}
}

	