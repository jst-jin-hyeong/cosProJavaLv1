
public class T_Solution6 {
	 public static void main(String[] args) {
	   
	        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
	        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
	       
	        int cnt=0;
	        
	        for(int i=0; i<recordA.length ; i++) {
	        	
	        	if(recordA[i]==((recordB[i]+1)%3))
	        		cnt+=3;
	        	else if ((recordA[i]!=recordB[i])&& (cnt>0))
	        		cnt-=1;
	        }
	        
	       System.out.println(cnt);
    }
}
