/*=======================================
   5�� 1��   5�� 1�� �ٸ� �ڵ� ����
 ========================================*/

class T_Solution1_Memo {
    public int solution(int[] steps, int n) {
        if (steps[n] > 0) 
        	return steps[n];
        
        if (n==1) 
        	steps[1] = 1;
        else if (n==2)
        	steps[2] = 2;
        else if (n==3)
        	steps[3] = 4;
        else
        	steps[n]=solution(steps,n-1)+solution(steps,n-2)+solution(steps,n-3);
       
        return steps[n];
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	T_Solution1_Memo sol = new T_Solution1_Memo();
    	int n1 = 6;
    	int[] steps = new int[n1+1];
    	int ret1 = sol.solution(steps, n1);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");   	
    }
}
