import java.time.Duration;
import java.time.LocalTime;

public class ExamFibo_Recursive {

	
	public static int fibo_re(int n) {
		if (n<=2) 
			return 1;
		else 			
			return fibo_re(n-1) + fibo_re(n-2);
	}
	
	public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();
        
      
    	System.out.println(fibo_re(45));
    	LocalTime endTime=LocalTime.now();
         
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
	}
}
