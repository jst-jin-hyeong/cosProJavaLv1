/*=======================================
    3�� 6��   3�� 1�� 6_initial_code.java
 ========================================*/
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= n; i += 2) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            if (@@@)
                primes.add(i);
        }
        
        int primeLen = primes.size();
        for (int i = 0; i < primeLen - 2; i++)
            for (int j = i + 1; j < primeLen - 1; j++)
                for (int k = j + 1; k < primeLen; k++)
                    if (@@@)
                        answer++;
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.    
    public static void main(String[] args) {
    	Solution sol = new Solution();
        int n1 = 33;
        int ret1 = sol.solution(n1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        int n2 = 9;
        int ret2 = sol.solution(n2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }    
}

