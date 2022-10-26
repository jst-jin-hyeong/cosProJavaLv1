import java.util.Stack;

public class ExamGraphDFS {
   
	public static int[][] graph  = new int[][]{
			{},	{2,3,4}, {1,4}, {1,6}, {1,2,5},	{4}, {3}     };  
    public static boolean[] visited = new boolean[graph.length];  
	 
	public static void DFS(int nodeIdx) {
		Stack<Integer> stack=new Stack<Integer>();
		int next;
		
		stack.push(nodeIdx);			//ù ��° ���(1)�� ���ÿ� �߰�
		visited[nodeIdx]=true;          //���� ��带 �湮 ó���ϰ� ���
		System.out.print(nodeIdx+" "); 
		
	    while(!stack.isEmpty()){       //������ ��� ���� ���� ����
		   int curNode = stack.peek();     //������ top ����
	   
    	   for(next=0; next< graph[curNode].length;next++) {  //���� ��忡 ����� ������ Ž��
	      	       int nextNode=graph[curNode][next];         //���� ��忡 ����� ���� ��� 
	               if(!visited[nextNode]) {                   //�湮�� ���� ������
	            	   stack.push(nextNode);                  //���ÿ� �߰� 
	               	   visited[nextNode]=true;                //���� ��带 �湮 ó���ϰ� ���
	               	   System.out.print(nextNode +" "); 
	               	   break;                                 //dfs�̹Ƿ� for�� ���� ����
		            }
	        }
	       if ( next == graph[curNode].length)   //�ش� ��忡�� ����� ��� ���Ҹ� �湮�ϸ� 
	    	   stack.pop();  	    	         //���ÿ��� �� ���� ���� ������  
	   }
	}

	public static void main(String[] args) {
		//1�� ��忡�� ����
	   DFS(1);
	}
}
