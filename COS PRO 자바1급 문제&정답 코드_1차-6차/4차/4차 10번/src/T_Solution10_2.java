import java.time.Duration;
import java.time.LocalTime;

/*=======================================
   4차 10번   4차 1급 10_initial_code.java
 ========================================*/

// 에라토스테네스의 체 방식

class T_Solution10_2 {
    public int solution(int a, int b) {
        int answer = 0;
	  	int k=(int)(Math.sqrt(b));        //마지막 소수는 b의 제곱근
	    boolean arr[] = new boolean[k+1];
	    
        //k개의 요소를 True로 초기값 설정
        for(int i=2; i<=k; i++) 
      	   arr[i]=true;           
       
        
        //소수의 배수에 해당하는 값들을 false로 지우기
        for(int n=2 ; n<=Math.sqrt(k) ; n++) {
        	if(arr[n]==true) {                //n이 소수이면      		
    		  for(int j=(n+n);j<=k;j=(j+n)) { //소수 n의 배수들을 false로 변경
    		      arr[j]=false;
    		  }
	        }
         }
              
        for(int n=2 ; n<arr.length ; n++) {
         	if (arr[n]==true) {    
         		if(n<=k) {
	         		int tmp=n*n;
	        		if (a<= tmp && tmp<=b)  { 
	        			answer+=1;
	        			System.out.println(answer+" " +n+"의 제곱:"+tmp);
	        		}        		
         		}
        		if(n<=1000) {
	        		int tmp2=n*n*n;
	        		if (a<= tmp2 && tmp2<=b) {
	        			answer+=1;
	        			System.out.println(answer+" "+n+"의 세제곱: "+tmp2);
	        		}
	        	}
        	}
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args){
        T_Solution10_2 sol = new T_Solution10_2();
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