/*=======================================
   5�� 1��   5�� 1�� �ٸ� �ڵ� ����
 ========================================*/

class T_Solution1_Recur {
    public int solution(int n) {
        if (n==1) 
        	return 1;
        else if (n==2)
        	return 2;
        else if (n==3)
        	return 4;
        else
        	return solution(n-1)+solution(n-2)+solution(n-3);
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	T_Solution1_Recur sol = new T_Solution1_Recur();
    	int n1 = 6;
    	int ret1 = sol.solution(n1);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");   	
    }
}
