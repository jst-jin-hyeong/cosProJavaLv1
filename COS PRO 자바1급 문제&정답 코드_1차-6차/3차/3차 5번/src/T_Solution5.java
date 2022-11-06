/*=======================================
    3차 5번   3차 1급 5_initial_code.java
 ========================================*/

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class T_Solution5 {
    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        
        String display = "______________" +phrases+"______________";   
        
        answer= display.substring(second%28, 14+second%28);
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        T_Solution5 sol = new T_Solution5();
        String phrases = new String("happy-birthday");
        int second = 50;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}