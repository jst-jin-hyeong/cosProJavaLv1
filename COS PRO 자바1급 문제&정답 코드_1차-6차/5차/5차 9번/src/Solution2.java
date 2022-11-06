/*=======================================
   5�� 9��   5�� 1�� 9_initial_code.java
 ========================================*/

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(int number, int target) {
		// ���⿡ �ڵ带 �ۼ����ּ���.
		int answer = 0;	
		
		Queue<Integer> q = new LinkedList<Integer>();
		int[] visited = new int[10001];
		q.offer(number);
		visited[number] = 1;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			
			if(x == target)
				break;
			
			if (x+1 <= 10000 && visited[x+1] == 0) {
				visited[x+1] = visited[x] + 1;
				q.offer(x+1);
			}
			if (x-1 >= 0 && visited[x-1] == 0) {
				visited[x-1] = visited[x] + 1;
				q.offer(x-1);
			}
			if (x*2 <= 10000 && visited[x*2] == 0) {
				visited[x*2] = visited[x] + 1;
				q.offer(x*2);
			}		
		}
		answer = visited[target]-1;
		
		return answer;
	}

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	}
}