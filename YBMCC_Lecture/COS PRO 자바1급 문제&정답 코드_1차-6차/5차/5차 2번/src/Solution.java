/*=======================================
   5�� 2��   5�� 1�� 2_initial_code.java
 ========================================*/

class Solution {
    public int solution(int[][] walls) {
        int answer = 0;

        for(int i = 0; i < walls.length; i++) {
        	for(int j = i+1; j < walls.length; j++) {
        		int area = 0;
        		if(walls[i][1] > walls[j][1])
        			area = walls[i][1] * (walls[j][0] - walls[i][0]);
        		else
        			area = walls[j][1] * (walls[j][0] - walls[i][0]);

        		if(answer < area)
        			answer = area;
        	}
        }

        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. �Ʒ����� �߸��� �κ��� ������, ���� �ڵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[][] walls = {{1, 4}, {2, 6}, {3, 5}, {5, 3}, {6, 2}};
    	int ret = sol.solution(walls);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}

