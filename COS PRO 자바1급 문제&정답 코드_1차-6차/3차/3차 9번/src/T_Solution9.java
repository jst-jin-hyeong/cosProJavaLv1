/*=======================================
    3�� 9��   3�� 1�� 9_initial_code.java
 ========================================*/

class T_Solution9 {
    public int solution(int[] revenue, int k) {
        int answer = 0;
        int n = revenue.length;
        int sum = 0;
        for (int i = 0; i <= n-k; i++) {
            sum=0;
            
            for (int j = i; j < i+k ;j++) {
            	sum = sum+revenue[j];
            	if (answer < sum)
            		answer = sum;
            }
        }
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        T_Solution9 sol = new T_Solution9();
        int[] revenue1 = {1, 1, 9, 3, 7, 6, 5, 10};
        int k1 = 4;
        int ret1 = sol.solution(revenue1, k1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int[] revenue2 = {1, 1, 5, 1, 1};
        int k2 = 1;
        int ret2 = sol.solution(revenue2, k2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");        
    }
}