
/*=======================================
    2�� 10��   2�� 1�� 10 T_Solution10.java
 ========================================*/
class T_Solution10 {
    public String solution(String s) {
        String answer = "" + s.charAt(0);
        for(int i = 1; i < s.length(); ++i){
            if ( (s.charAt(i-1)=='1') || (s.charAt(i)=='1') )
            	answer+=s.charAt(i);
        
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        T_Solution10 sol = new T_Solution10();
        String s = "101100011100";
        String ret = sol.solution(s);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}