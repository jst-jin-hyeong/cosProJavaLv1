/*=======================================
   5�� 3��   5�� 1�� 3_initial_code.java
 ========================================*/

import java.util.*;

class Solution {
	public void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Arrays.sort(numbers);
        int mid = (numbers.length - 1) / 2;
        swap(numbers, mid, numbers.length-1);

        int left = mid + 1;
        int right = numbers.length - 1;
        while(left <= right) {
        	swap(numbers, left, right);
        	left = left + 1;
        	right = right - 1;
        }

        answer = numbers;
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. �Ʒ����� �߸��� �κ��� ������ ���� �ڵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] numbers = {7, 3, 4, 1, 2, 5, 6};
    	int[] ret = sol.solution(numbers);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.print("solution �޼ҵ��� ��ȯ ���� {");
    	for(int i = 0; i < ret.length; i++) {
    		if(i != 0)
    			System.out.print(", ");
    		System.out.print(ret[i]);
    	}
    	System.out.println("} �Դϴ�.");
    }
}
