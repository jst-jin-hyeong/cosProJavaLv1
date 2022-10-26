import java.util.Arrays;

public class ExamArrays {

	public static void main(String[] args) {
		
		int[] arrA = {5,9,2,1,3,6,7,3};
        int[] arrB = new int[8];
        
        Arrays.fill(arrB, 3);
        System.out.println("Arrays.fill(): " + Arrays.toString(arrB));  
        
        Arrays.fill(arrB, 0);
          
        //Arrays.copyOf()
        int[] arcopyOf = Arrays.copyOf(arrA, 2);
        System.out.println("Arrays.copyof(): " + Arrays.toString(arcopyOf));   
        
        //Arrays.copyofRange()
        int[] arcopyofRange = Arrays.copyOfRange(arrA, 1, 5);
        System.out.println("Arrays.copyofRange(): " +Arrays.toString(arcopyofRange)); 
        
        //System.arraycopy()
        System.arraycopy(arrA, 1, arrB, 0, 3);
        System.out.println("System.arraycopy()-일부: " + Arrays.toString(arrB));
        System.arraycopy(arrA, 0, arrB, 0, arrA.length);
        System.out.println("System.arraycopy()-전부: " + Arrays.toString(arrB));

        //Arrays.sort()
        Arrays.sort(arrA);
        System.out.println("Arrays.sort()-정렬: " + Arrays.toString(arrA));
        
        //Arrays.equals()
        System.out.println(Arrays.equals(arrA,arrB));
        arrB = Arrays.copyOf(arrA,arrA.length);
        System.out.println("Arrays.equals(): " + Arrays.equals(arrA,arrB));
        
        //Arrays.binarySearch() 배열이 정렬되어 있어야 함
        System.out.println("Arrays.binarySearch(): " +Arrays.binarySearch(arrA, 9));
        
	}
}
