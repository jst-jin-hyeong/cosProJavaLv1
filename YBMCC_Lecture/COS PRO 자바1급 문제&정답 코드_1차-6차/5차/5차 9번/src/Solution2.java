/*=======================================
   5차 9번   5차 1급 9_initial_code.java
 ========================================*/

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(int number, int target) {
		// 여기에 코드를 작성해주세요.
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

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}