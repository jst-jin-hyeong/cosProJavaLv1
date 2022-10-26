import java.time.Duration;
import java.time.LocalTime;

public class ExamPrimeNumEra{

	public static void main(String[] args) {
	  int n=100000;
      boolean arr[] = new boolean[n+1];
      LocalTime startTime = LocalTime.now();
      //n개의 요소에 True 로 초기값 설정
      for(int i=2; i<=n;i++)
    	  arr[i]=true;
      
      for(int i=2; i<=Math.sqrt(n); i++) {
    	  if(arr[i]==true) {                //i가 소수인 경우
    		  for(int j=(i+i);j<=n;j=j+i) { //i의 배수들을 false로 변경
    		      arr[j]=false;    	
    		  }
    	  } 
      }
      //소수 값 출력, 배열의 인덱스 번호를 활용
      for(int i=2;i<=n;i++) {
    	  if (arr[i]==true)
          	  System.out.println(i);
        }
      
      LocalTime endTime=LocalTime.now();
      
      Duration d = Duration.between(startTime, endTime);
      System.out.println(d.getSeconds()+"."+d.getNano());
	}
}


//System.out.println(i+" "+j+" "+arr[j]);
