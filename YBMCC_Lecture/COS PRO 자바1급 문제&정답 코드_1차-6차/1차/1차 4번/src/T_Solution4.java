import java.util.Arrays;
import java.util.Collections;

public class T_Solution4 {
	public static void main(String[] args) {
		

        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] arrS=new int[arrA.length+arrB.length];
       
        //�迭 ����
        System.arraycopy(arrA, 0, arrS, 0, arrA.length);
        System.arraycopy(arrB, 0, arrS, arrA.length, arrB.length);
        
   
        for(int i =0; i<7; i++) System.out.print(arrS[i]+"\t");
        System.out.println();
        
        //����
        Arrays.sort(arrS);
        
        for(int i =0; i<7; i++) System.out.print(arrS[i]+"\t");
        
        //���� ����
        Integer[] arrS2= Arrays.stream(arrS).boxed().toArray(Integer[]::new);
        	        
        Arrays.sort(arrS2,Collections.reverseOrder());
      
        for(int k:arrS2) System.out.print(k+"\t");
		}
}

