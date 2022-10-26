import java.time.Duration;
import java.time.LocalTime;

public class ExamFibo_DPTabulation {

	
	public static int fibo_dp(int n) {
		int dp[]=new int[n+1];
		dp[1]=1;
		dp[2]=1;
		for(int i=3; i<=n;i++) 
			dp[i]=dp[i-1]+dp[i-2];
		return dp[n];
	}
	
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
        
	      
    	System.out.println(fibo_dp(40));
    	LocalTime endTime=LocalTime.now();
         
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());

	
	}
}
