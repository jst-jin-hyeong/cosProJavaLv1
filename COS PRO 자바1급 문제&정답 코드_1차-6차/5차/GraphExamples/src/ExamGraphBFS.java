import java.util.LinkedList;
import java.util.Queue;

public class ExamGraphBFS {

	   
		public static int[][] graph  = new int[][]{
				{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };
		    
	    public static boolean[] visited = new boolean[graph.length];  
	    
		public static void BFS(int nodeIdx) {
			Queue<Integer> q=new LinkedList<Integer>();
			
			q.offer(nodeIdx);                //ù ��° ���(1)�� ť�� �߰�
			visited[nodeIdx]=true;           //���� ��带 �湮 ó���ϰ� ���
			System.out.print(nodeIdx+" ");
		
			while(!q.isEmpty()) {
				
				int curNode=q.poll();                   //ť �� �� ��� ������
				
				//���� ���� ������ ��� ��带 Ȯ���ϸ鼭		
				for(int i=0; i<graph[curNode].length;i++) {
					int nextNode = graph[curNode][i];
					if(!visited[nextNode]) {             //�湮�� ���� ������  
						q.offer(nextNode);               //ť�� �߰��ϰ�
						visited[nextNode]=true;          //�湮 ó���ϰ� ���
						System.out.print(nextNode+" "); 
					}
				}
			}
		}
		
		public static void main(String[] args) {
			//1�� ��忡�� ����
		   BFS(1);
		}
	}
