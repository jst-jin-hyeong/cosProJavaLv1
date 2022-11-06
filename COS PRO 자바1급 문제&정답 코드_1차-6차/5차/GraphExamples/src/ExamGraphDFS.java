import java.util.Stack;

public class ExamGraphDFS {
   
	public static int[][] graph  = new int[][]{
			{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };  
    public static boolean[] visited = new boolean[graph.length];  
	 
	public static void DFS(int nodeIdx) {
		Stack<Integer> stack=new Stack<Integer>();
		int next;
		
		stack.push(nodeIdx);			//첫 번째 노드(1)를 스택에 추가
		visited[nodeIdx]=true;          //현재 노드를 방문 처리하고 출력
		System.out.print(nodeIdx+" "); 
		
	    while(!stack.isEmpty()){       //스택이 비어 있지 않은 동안
		   int curNode = stack.peek();     //스택의 top 보기
	   
    	   for(next=0; next< graph[curNode].length;next++) {  //현재 노드에 연결된 노드들을 탐색
	      	       int nextNode=graph[curNode][next];         //현재 노드에 연결된 다음 노드 
	               if(!visited[nextNode]) {                   //방문한 적이 없으면
	            	   stack.push(nextNode);                  //스택에 추가 
	               	   visited[nextNode]=true;                //현재 노드를 방문 처리하고 출력
	               	   System.out.print(nextNode +" "); 
	               	   break;                                 //dfs이므로 for문 빠져 나감
		            }
	        }
	       if ( next == graph[curNode].length)   //해당 노드에서 연결된 모든 원소를 방문하면 
	    	   stack.pop();  	    	         //스택에서 맨 위의 것을 꺼내기  
	   }
	}

	public static void main(String[] args) {
		//1번 노드에서 시작
	   DFS(1);
	}
}
