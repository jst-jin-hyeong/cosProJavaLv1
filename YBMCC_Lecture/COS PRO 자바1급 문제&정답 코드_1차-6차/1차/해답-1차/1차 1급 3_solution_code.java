/*=======================================
   1�� 1�� 3_solution_code.java
 ========================================*/

class Solution {
    public int solution(String pos) {
    	
    	int dx[] = {1,1,-1,-1,2,2,-2,-2};
    	int dy[] = {2,-2,-2,2,1,-1,-1,1};
    	
    	int cx = pos.charAt(0) - 'A';
    	int cy = pos.charAt(1) - '0' - 1;
    	
    	int ans = 0;
    	
    	for (int i = 0; i < 8; ++i) {
    		int nx = cx + dx[i];
    		int ny = cy + dy[i];
    		if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8)
    			ans++;
    	}
    	return ans;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �Լ��Դϴ�.
    public static void main(String[] args) {
    	Solution sol = new Solution();
	    String ex0_pos = "A7";
	    int ex0_ret = sol.solution(ex0_pos);
    	
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.printf("ù ��° ������ ���� %d �Դϴ�.\n", 3);
        System.out.printf("solution �Լ��� ��ȯ ���� %d �Դϴ�.\n", ex0_ret);
    }
}