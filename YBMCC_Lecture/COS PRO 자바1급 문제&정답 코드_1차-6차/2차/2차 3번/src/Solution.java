
/*=======================================
    2�� 3��   2�� 1�� 3_initial_code.java
 ========================================*/
class Solution {
    public int func_a(int n){
        int ret = 1;
        while(n > 0){
            ret *= 10;
            n--;
        }
        return ret;
    }

    int func_b(int n){
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10;
        }
        return ret;
    }
    
    int func_c(int n){
        int ret = 0;
        while(n > 0){
            ret += n%10;
            n /= 10;
        }
        return ret;
    }
    
	public int solution(int num) {
        int nextNum = num;
        while(true){
            nextNum++;
            int length = func_@@@(@@@);
            if(length % 2 != 0)
                continue;

            int divisor = func_@@@(@@@);
            int front = nextNum / divisor;
            int back = nextNum % divisor;
            
            int frontSum = func_@@@(@@@);
            int backSum = func_@@@(@@@);
            if(frontSum == backSum)
                break;
        }
        return nextNum - num;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 1;
        int ret1 = sol.solution(num1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int num2 = 235386;
        int ret2 = sol.solution(num2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}