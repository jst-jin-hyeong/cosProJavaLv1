import java.time.Duration;
import java.time.LocalTime;

public class ExamPrimeNumEra{

	public static void main(String[] args) {
	  int k=100;
      boolean arr[] = new boolean[k+1];
      LocalTime startTime=LocalTime.now();
      //k개의 요소에 True 로 초기값 설정
      for(int i=2; i<=k;i++)
    	  arr[i]=true;
      
      //배수에 해당하는 값들을 false로 모두 지우기
      for(int n=2; n<=Math.sqrt(k); n++) {   //2부터 √k 까지 반복 
    	  if(arr[n]==true) {                //n이 소수인 경우
    		  for(int j=(n+n);j<=k;j=j+n) { //n의 배수들을 false로 변경
    		      arr[j]=false;    	
    		  }
    	  } 
      }
      
      //소수 값 출력, 배열의 인덱스 번호를 활용
      for(int i=2;i<=k;i++) {
    	  if (arr[i]==true)
          	  System.out.println(i);
      }
      
      LocalTime endTime=LocalTime.now();
      
      Duration d = Duration.between(startTime, endTime);
      System.out.println(d.getSeconds()+"."+d.getNano());
	}
}


//System.out.println(i+" "+j+" "+arr[j]);
