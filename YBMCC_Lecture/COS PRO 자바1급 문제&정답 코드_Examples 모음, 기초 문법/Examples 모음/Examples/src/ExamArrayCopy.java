import java.util.Arrays;

public class ExamArrayCopy {

	public static void main(String[] args) {
		
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] arrS=new int[arrA.length+arrB.length];
        
        System.arraycopy(arrA, 0, arrS, 0, arrA.length);
        System.arraycopy(arrB, 0, arrS, arrA.length, arrB.length);
        
        for(int i =0; i<7; i++) System.out.print(arrS[i]+"\t");
        System.out.println();
        
        Arrays.sort(arrS);
        
        for(int i =0; i<7; i++) System.out.print(arrS[i]+"\t");
       
	}
}
