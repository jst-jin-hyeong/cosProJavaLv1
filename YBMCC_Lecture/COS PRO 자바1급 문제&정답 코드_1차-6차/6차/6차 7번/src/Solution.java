/*=======================================
   6�� 7��   6�� 1�� 7_initial_code.java
 ========================================*/

class Solution {
    public int solution(int K, int[] numbers, String[] UpDown) {
        int left = 1;
        int right = K;
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if(UpDown[i].equals("UP"))
                left = @@@;
            else if(UpDown[i].equals("DOWN"))
                right = @@@;
            else if(UpDown[i].equals("RIGHT"))
                return 1;
        }
        return @@@;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int K1 = 10;
        int[] numbers1 = {4, 9, 6};
        String[] UpDown1 = {new String("UP"), new String("DOWN"), new String("UP")};
        int ret1 = sol.solution(K1, numbers1, UpDown1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int K2 = 10;
        int[] numbers2 = {2, 1, 6};
        String[] UpDown2 = {new String("UP"), new String("UP"), new String("DOWN")};
        int ret2 = sol.solution(K2, numbers2, UpDown2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");

        int K3 = 100;
        int[] numbers3 = {97, 98};
        String[] UpDown3 = {new String("UP"), new String("RIGHT")};
        int ret3 = sol.solution(K3, numbers3, UpDown3);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret3 + " �Դϴ�.");
    }
}

