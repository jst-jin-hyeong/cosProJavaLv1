/*=======================================
   5�� 5��   5�� 1�� 5_initial_code.java
 ========================================*/

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution {
    public int solution(int[] enemies, int[] armies) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 0;
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}

