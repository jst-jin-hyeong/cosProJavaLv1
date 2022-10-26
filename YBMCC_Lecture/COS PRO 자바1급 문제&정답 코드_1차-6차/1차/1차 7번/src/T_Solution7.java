
public class T_Solution7 {
	
	   int solution(int[] prices){
	        int answer = -1000000001;
	        int tmpProfit;
	        
	        for(int i=0; i< prices.length ; i++){
	        	for(int j=i+1; j<prices.length; j++) {
	        		tmpProfit=prices[j]-prices[i];
	        		answer=Math.max(answer,tmpProfit);
	        	}
	        }
	        return answer;
	    }

	    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
	    public static void main(String[] args) {
	        T_Solution7 sol = new T_Solution7();
	        int[] prices1 = {1, 2, 3};
	        int ret1 = sol.solution(prices1);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret1 + " .");
	        
	        int[] prices2 = {3, 1};
	        int ret2 = sol.solution(prices2);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret2 + " .");
	    }
}
