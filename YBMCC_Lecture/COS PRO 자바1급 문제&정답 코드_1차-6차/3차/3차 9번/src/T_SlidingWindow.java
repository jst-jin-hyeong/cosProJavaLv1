/*=======================================
    3�� 9��   3�� 1�� 9_initial_code.java
 ========================================*/

class T_SlidingWindow {
    public int solution(int[] revenue, int k) {
    	 int answer = 0;
         int n = revenue.length;
         int sum = 0;
         
         for (int i = 0; i < k ; i++) {
         	sum += revenue[i];
         }
         
         answer = sum;
         
         for (int i = 1; i<=n-k; i++  ) {
         	sum = sum - revenue[i-1] + revenue[i+k-1];
         	if ( answer < sum)
         		answer = sum;
         }
         return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        T_SlidingWindow sol = new T_SlidingWindow();
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