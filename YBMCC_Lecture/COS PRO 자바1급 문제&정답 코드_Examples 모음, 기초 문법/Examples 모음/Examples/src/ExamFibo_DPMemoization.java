import java.time.Duration;
import java.time.LocalTime;

public class ExamFibo_DPMemoization {
	public static int dp[]=new int[500];
	
	public static int fibo_dp(int n) {
		if (n<=2) 
			return 1;


		if(dp[n]!=0)
			return dp[n];
		else {
		    dp[n]=	fibo_dp(n-1) + fibo_dp(n-2);
		    return dp[n];
		}
	}
	
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
		
    	System.out.println(fibo_dp(45));
    	LocalTime endTime=LocalTime.now();
         
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
        
        
        
        
	}
}
