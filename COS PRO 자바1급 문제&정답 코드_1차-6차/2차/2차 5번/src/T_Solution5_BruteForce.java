/*=======================================
    2차 5번   T_Solution5_BruteForce.java
 ========================================*/

// 다음과 같이 import를 사용할 수 있습니다.
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class T_Solution5_BruteForce {

	   
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int answer=0;
        int cnt=1,i,j;
        
        LocalTime startTime = LocalTime.now();
        
        for (int t=0;t<=1000000000;t++) {   
	        answer=0;
	        cnt=1;
	        
	        for (i=0; i<arr.length -1;i++) {
	        	for (j=i+1; j < arr.length ; j++ ) {
	        		if (arr[j-1] < arr[j])
	        				cnt+=1;
	        		else
	        			break;
	        	}
	        	
	        	answer=Math.max(answer, cnt);
	        	cnt=1;
	        	
	        }
        
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + answer + " 입니다.");
        
        LocalTime endTime=LocalTime.now();
        
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
    }
}