/*=======================================
    2�� 5��   T_Solution5_BruteForce.java
 ========================================*/

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class T_Solution5_BruteForce {

	   
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
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
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + answer + " �Դϴ�.");
        
        LocalTime endTime=LocalTime.now();
        
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
    }
}