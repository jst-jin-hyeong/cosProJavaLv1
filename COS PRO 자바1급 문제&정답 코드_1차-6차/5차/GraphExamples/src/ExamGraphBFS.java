import java.util.LinkedList;
import java.util.Queue;

public class ExamGraphBFS {

	   
		public static int[][] graph  = new int[][]{
				{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };
		    
	    public static boolean[] visited = new boolean[graph.length];  
	    
		public static void BFS(int nodeIdx) {
			Queue<Integer> q=new LinkedList<Integer>();
			
			q.offer(nodeIdx);                //첫 번째 노드(1)를 큐에 추가
			visited[nodeIdx]=true;           //현재 노드를 방문 처리하고 출력
			System.out.print(nodeIdx+" ");
		
			while(!q.isEmpty()) {
				
				int curNode=q.poll();                   //큐 맨 앞 노드 꺼내기
				
				//현재 노드와 인접한 모든 노드를 확인하면서		
				for(int i=0; i<graph[curNode].length;i++) {
					int nextNode = graph[curNode][i];
					if(!visited[nextNode]) {             //방문한 적이 없으면  
						q.offer(nextNode);               //큐에 추가하고
						visited[nextNode]=true;          //방문 처리하고 출력
						System.out.print(nextNode+" "); 
					}
				}
			}
		}
		
		public static void main(String[] args) {
			//1번 노드에서 시작
		   BFS(1);
		}
	}
