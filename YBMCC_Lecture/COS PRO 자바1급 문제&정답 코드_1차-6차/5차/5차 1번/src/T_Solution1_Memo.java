/*=======================================
   5차 1번   5차 1급 다른 코딩 제안
 ========================================*/

class T_Solution1_Memo {
    public int solution(int[] steps, int n) {
        if (steps[n] > 0) 
        	return steps[n];
        
        if (n==1) 
        	steps[1] = 1;
        else if (n==2)
        	steps[2] = 2;
        else if (n==3)
        	steps[3] = 4;
        else
        	steps[n]=solution(steps,n-1)+solution(steps,n-2)+solution(steps,n-3);
       
        return steps[n];
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	T_Solution1_Memo sol = new T_Solution1_Memo();
    	int n1 = 6;
    	int[] steps = new int[n1+1];
    	int ret1 = sol.solution(steps, n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");   	
    }
}
