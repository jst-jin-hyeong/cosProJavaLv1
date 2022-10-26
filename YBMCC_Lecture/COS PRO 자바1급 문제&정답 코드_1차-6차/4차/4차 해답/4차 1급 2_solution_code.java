
/*=======================================
   4차 1급 2_solution_code.java
   ybmit.com의 샘플 문제에 있는 정답입니다.
   문제와 코드가 달라서 4차 2번 폴더에 T_Solution2.java 참고 바랍니다.
 ========================================*/

class Solution {
	String small_letters = "abcdefghijklmnopqrstuvwxyz";
	String big_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String numbers = "0123456789";
	public char convert_small(char alphabet) {
		for (int i = 0; i < 26; i++) {
			if (big_letters.charAt(i) == alphabet) {
				return small_letters.charAt(i);
			}
		}
		return alphabet;
	}
	public char int_to_string(int val) {
		return numbers.charAt(val);
	}
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        char boss;
        int cnt = 1;
        boss = convert_small(s.charAt(0));
        for (int i = 1; i < len; i++) {
        	if (convert_small(s.charAt(i)) == boss) {
        		cnt += 1;
        	}
        	else {
        		answer += boss;
        		answer += int_to_string(cnt);
        		boss = convert_small(s.charAt(i));
        		cnt = 1;
        	}
        }
		answer += boss;
		answer += int_to_string(cnt);
		return answer;
    }
}