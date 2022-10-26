import java.time.Duration;
import java.time.LocalTime;

public class ExamFibo_DPMemoization2 {
	public static int dp2[]=new int[500];

	
	public static int fibo_dp2(int n) {
		if (n<=2) 
			return 1;
		
		if (dp2[n]!=0)  {
			return dp2[n]; }
		else {
			dp2[n]=fibo_dp2(n-1) + fibo_dp2(n-2);
			return dp2[n];
		}
	}
	
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
		
		for(int i=0; i<45;i++)
			dp2[i]=0;
	      
    	System.out.println(fibo_dp2(45));
    	LocalTime endTime=LocalTime.now();
         
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());

	
	}
}
