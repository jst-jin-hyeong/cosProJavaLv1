/*=======================================
   6�� 1�� 3_solution_code.java
   ybmit.com ����Ʈ�� ���� ���Ͽ��� ������ ���õǾ� ���� �ʽ��ϴ�.
   �Ʒ��� ���� ������ ���� �մϴ�.

 ========================================*/
import java.util.*;

class Solution {
    public int solution(int[] arr, int K) {
    	// ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 0;
        Arrays.sort(arr);
        answer =1001;
        
        for(int i =0; i<= arr.length-K ; i++)
        	answer = Math.min(answer, arr[i+K-1]-arr[i]);
        return answer;
    } 
}

