/*=======================================
    2차 5번   T_Solution5_DP.java
 ========================================*/

// 다음과 같이 import를 사용할 수 있습니다.
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class T_Solution5_DP {

	   
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int answer=0;
        int i;
        int dp[] = new int[arr.length];
        
        LocalTime startTime = LocalTime.now();
        
        for (int t=0;t<=1000000000;t++) {   
      
	        for(i = 0; i < dp.length; ++i)
	            dp[i] = 1;
	        for(i = 1; i < arr.length; ++i)
	            if(arr[i] > arr[i-1])
	                dp[i] = dp[i-1] + 1;
	        answer = 0;
	        for(i = 0; i < arr.length; ++i)
	            answer = Math.max(answer, dp[i]);
	        
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + answer + " 입니다.");
        
        LocalTime endTime=LocalTime.now();
        
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
    }
}