import java.time.Duration;
import java.time.LocalTime;

public class TimeTest1 {

	public static void main(String[] args) {
	
		LocalTime startTime = LocalTime.now();
       
        for (long i=0; i<=100000000L; i++) {
            int num=9950000;
            long digit = 1;
            while (num / digit % 10 == 0) {
                num += digit;
                digit *= 10;
            }
        }  
        
		LocalTime endTime = LocalTime.now();
		
		Duration d = Duration.between(startTime, endTime);
		System.out.println(d.getSeconds()+"."+ d.getNano());
		
		//==================================================

		
		LocalTime startTime2 = LocalTime.now();
		//System.out.println(startTime2);
		
        for (long i=0; i<=100000000L; i++) {
            long answer = 0;
            String str=null;
            
            int num=9950000;
            str=num+"";
            str=str.replace("0", "1");
            answer= Long.parseLong(str);
        }
        
		LocalTime endTime2 = LocalTime.now();
		
		Duration d2 = Duration.between(startTime2, endTime2);
		System.out.println(d2.getSeconds()+"."+ d2.getNano());
	}
	

}
