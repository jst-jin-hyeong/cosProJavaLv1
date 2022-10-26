/*=======================================
    2�� 2��   2�� 1�� 2_initial_code.java
 ========================================*/

class Solution {
    public int func_a(String times){
        int hour = Integer.parseInt(times.substring(0, 2));
        int minute = Integer.parseInt(times.substring(3));
        return hour*60 + minute;
    }
    public int solution(String[] subwayTimes, String currentTime) {
        int currentMinute = func_a(@@@);
        int INF = 1000000000;
        int answer = INF;
        for(int i = 0; i < subwayTimes.length; ++i){
            int subwayMinute = func_a(@@@);
            if(@@@){
                answer = subwayMinute - currentMinute;
                break;
            }
        }
        if(answer == INF)
            return -1;
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] subwayTimes1 = {"05:31", "11:59", "13:30", "23:32"};
        String currentTime1 = "12:00";
        int ret1 = sol.solution(subwayTimes1, currentTime1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        String[] subwayTimes2 = {"14:31", "15:31"};
        String currentTime2 = "15:31";
        int ret2 = sol.solution(subwayTimes2, currentTime2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}

