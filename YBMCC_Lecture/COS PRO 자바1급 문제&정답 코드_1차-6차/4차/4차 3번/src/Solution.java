/*=======================================
   4�� 3��   4�� 1�� 3_initial_code.java
 ========================================*/

class Solution {
    public long solution(int oneDayPrice, int multiDay, int multiDayPrice, long n){
        if(oneDayPrice * multiDay <= multiDayPrice)
            return n * oneDayPrice;
        else
            return (n % multiDay) * multiDayPrice + (n / multiDay) * oneDayPrice;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� �ڵ��Դϴ�. �Ʒ����� �߸��� �κ��� ������, ���� �ڵ常 �����ϼ���.
    public static void main(String[] args) {        
        Solution sol = new Solution();
 
        int oneDayPrice1 = 3;
        int multiDay1 = 5;
        int multiDayPrice1 = 14;
        long n1 = 6;
        long ret1 = sol.solution(oneDayPrice1, multiDay1, multiDayPrice1, n1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int oneDayPrice2 = 2;
        int multiDay2 = 3;
        int multiDayPrice2 = 5;
        long n2 = 11;
        long ret2 = sol.solution(oneDayPrice2, multiDay2, multiDayPrice2, n2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}