/*=======================================
   4차 1번   4차 1급 1_initial_code.java
   브루트 포스 방식 사용
 ========================================*/

import java.util.*;

public class T_Solution1 {
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;
  
    public int solution(String word) {
        int answer = 0;
        words  = new ArrayList<String>();        
        words.add("");
        
        for (int i1 = 0; i1 < 5; i1++) {
        	words.add(vowels[i1]);  
        	for (int i2 = 0; i2 < 5; i2++) {
            	words.add(vowels[i1]+vowels[i2]);  
            	for (int i3 = 0; i3 < 5; i3++) {
                	words.add(vowels[i1]+vowels[i2]+vowels[i3]); 
                	for (int i4 = 0; i4 < 5; i4++) {
                    	words.add(vowels[i1]+vowels[i2]+vowels[i3]+vowels[i4]);
                    	for (int i5 = 0; i5 < 5; i5++) {
                        	words.add(vowels[i1]+vowels[i2]+vowels[i3]+vowels[i4]+vowels[i5]);  
                         }
                    }
                }
            }
        }
  
        for(int i=1; i<words.size();i++)
        	System.out.println(words.get(i));
        
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        T_Solution1 sol = new T_Solution1();
        String word1 = new String("AAAAE");
        int ret1 = sol.solution(word1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

//        String word2 = new String("AAAE");
//        int ret2 = sol.solution(word2);
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}