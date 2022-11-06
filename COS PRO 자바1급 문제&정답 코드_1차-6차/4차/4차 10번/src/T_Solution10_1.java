import java.time.Duration;
import java.time.LocalTime;

/*=======================================
   4차 10번   4차 1급 10_initial_code.java
 ========================================*/

// 브루트 포스 방식

class T_Solution10_1 {
    public int solution(int a, int b) {
        int answer = 0;
        boolean prime;
                
        for(int n=2;n<=Math.sqrt(b);n++) {
        	prime=true;
        	for(int i=2;i<n;i++) {
        		if(n%i==0) {
        			prime=false;
        			break;
        		}
        	}  
        	
        	if (prime==true) {
              		int tmp=n*n;             //(int)(Math.pow(n,2))
	        		if (a<= tmp && tmp<=b)   
	        			answer+=1;   		
	        		if(n<=1000) {
		        		int tmp2=n*n*n;
		        		if (a<= tmp2 && tmp2<=b) 
		        			answer+=1;
	        		}
        	}
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args){
        T_Solution10_1 sol = new T_Solution10_1();
        int a = 6;
        int b = 1000000000;

        LocalTime startTime = LocalTime.now();
        int ret = sol.solution(a, b);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
        LocalTime endTime=LocalTime.now();
        
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
    }
}