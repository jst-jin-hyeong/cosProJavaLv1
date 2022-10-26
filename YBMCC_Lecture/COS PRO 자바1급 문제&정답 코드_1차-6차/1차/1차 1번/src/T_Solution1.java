/*=======================================
    다른 코딩 제안 1차 1번   1차 1급 1_initial_code.java
 ========================================*/

public class T_Solution1 {
	
	public long solution(long num) {
	        long answer = 0;
	        String str=null;
	        
	        num++;
	        str=num+"";
	        str=str.replace("0", "1");
	        answer= Long.parseLong(str);
	        return answer;
	    }
  
		// The following is main method to output testcase.
	    public static void main(String[] args) {
	        T_Solution1 sol = new T_Solution1();
	        long num = 9949999;
	        long ret = sol.solution(num);

	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret + " .");
	    }
}
