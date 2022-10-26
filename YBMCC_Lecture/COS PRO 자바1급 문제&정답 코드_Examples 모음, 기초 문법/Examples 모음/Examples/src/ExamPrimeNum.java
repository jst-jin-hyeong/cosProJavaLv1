import java.time.Duration;
import java.time.LocalTime;

public class ExamPrimeNum {

	public static void main(String[] args) {
	  int k=100000;
      int arr[] = new int[k];
      boolean primeNum;
      int idx =0;
      LocalTime startTime = LocalTime.now();
      
      for(int n=2; n<=k; n++) {
    	  primeNum=true;
    	  for(int i=2;i<n;i++) {
    		  if(n%i ==0) {
    			  primeNum=false;
    			  break;
    		  }
    	  }
    	  if(primeNum==true)
    		  arr[idx++]=n;   
      } 
      for(int i=0;i<idx;i++)
    	  System.out.println(arr[i]);
      
      LocalTime endTime=LocalTime.now();
      
      Duration d = Duration.between(startTime, endTime);
      System.out.println(d.getSeconds()+"."+d.getNano());
	}
}
