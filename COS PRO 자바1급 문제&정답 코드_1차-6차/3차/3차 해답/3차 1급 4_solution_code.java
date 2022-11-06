
/*=======================================
   3차 1급 4_solution_code.java
   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 드립니다.
 ========================================*/

class Solution {
	
	int overlap(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
		int over_len = 0;
		
		for ( int i =1 ; i <= len ; i++) {
			String f = s1.substring(s1.length() - i);
			String s = s2.substring(0,i);

			if (f.equals(s))
				over_len = i;
		}
		return s1.length() + s2.length() - over_len;
		
	}
	
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;  
        answer = Math.min(overlap(s1,s2), overlap(s2,s1));
        return answer;
    }
    

}

