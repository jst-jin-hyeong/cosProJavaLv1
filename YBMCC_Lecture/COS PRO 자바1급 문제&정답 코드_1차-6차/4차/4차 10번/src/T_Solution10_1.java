import java.time.Duration;
import java.time.LocalTime;

/*=======================================
   4�� 10��   4�� 1�� 10_initial_code.java
 ========================================*/

// ���Ʈ ���� ���

class T_Solution10_1 {
    public int solution(int a, int b) {
        int answer = 0;
        boolean prime;
                
        for(int n=2;n<=Math.sqrt(b);n++) {
        	prime=true;
        	for(int i=2;i<n;i++) {
        		if(n%i==0) {
        			prime=false;
        			break;
        		}
        	}  
        	
        	if (prime==true) {
              		int tmp=n*n;             //(int)(Math.pow(n,2))
	        		if (a<= tmp && tmp<=b)   
	        			answer+=1;   		
	        		if(n<=1000) {
		        		int tmp2=n*n*n;
		        		if (a<= tmp2 && tmp2<=b) 
		        			answer+=1;
	        		}
        	}
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args){
        T_Solution10_1 sol = new T_Solution10_1();
        int a = 6;
        int b = 1000000000;

        LocalTime startTime = LocalTime.now();
        int ret = sol.solution(a, b);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
        LocalTime endTime=LocalTime.now();
        
        Duration d = Duration.between(startTime, endTime);
        System.out.println(d.getSeconds()+"."+d.getNano());
    }
}