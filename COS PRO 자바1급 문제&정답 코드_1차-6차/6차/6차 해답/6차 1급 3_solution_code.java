/*=======================================
   6차 1급 3_solution_code.java
   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 합니다.

 ========================================*/
import java.util.*;

class Solution {
    public int solution(int[] arr, int K) {
    	// 여기에 코드를 작성해주세요.
        int answer = 0;
        Arrays.sort(arr);
        answer =1001;
        
        for(int i =0; i<= arr.length-K ; i++)
        	answer = Math.min(answer, arr[i+K-1]-arr[i]);
        return answer;
    } 
}

