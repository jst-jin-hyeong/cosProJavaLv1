/*=======================================
    3�� 5��   3�� 1�� 5_initial_code.java
 ========================================*/

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class T_Solution5 {
    public String solution(String phrases, int second) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        String answer = "";
        
        String display = "______________" +phrases+"______________";   
        
        answer= display.substring(second%28, 14+second%28);
        
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        T_Solution5 sol = new T_Solution5();
        String phrases = new String("happy-birthday");
        int second = 50;
        String ret = sol.solution(phrases, second);
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}