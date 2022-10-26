/*=======================================
   5차 1번   5차 1급 다른 코딩 제안
 ========================================*/

class T_Solution1_Recur {
    public int solution(int n) {
        if (n==1) 
        	return 1;
        else if (n==2)
        	return 2;
        else if (n==3)
        	return 4;
        else
        	return solution(n-1)+solution(n-2)+solution(n-3);
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	T_Solution1_Recur sol = new T_Solution1_Recur();
    	int n1 = 6;
    	int ret1 = sol.solution(n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");   	
    }
}
