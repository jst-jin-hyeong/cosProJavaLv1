
/*=======================================
   6차 1급 2_solution_code.java
   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 합니다.

 ========================================*/


    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 1;
        int sum = 0;
        
        for (int i=0; i<words.length ; i++) {
        	int len = words[i].length();
        	if (sum !=0)
        		sum++;
        	sum+=len;
        	if (sum > K) {
        		answer++;
        		sum=len;
        	}
        }      
        return answer;
    }

    