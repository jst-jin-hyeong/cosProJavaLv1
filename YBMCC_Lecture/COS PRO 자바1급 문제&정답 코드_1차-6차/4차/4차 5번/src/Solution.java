/*=======================================
   4�� 5��   4�� 1�� 5_initial_code.java
 ========================================*/

class Solution {
    public String reverse(String number) {
        String reverseNumber = "";
        for(int i = number.length()-1; i >= 0; i--)
            @@@;
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += Integer.toString(@@@);
            answer = reverse(answer);
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        String ret = sol.solution(n);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}

