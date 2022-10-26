
public class T_Solution9 {

	public static void main(String[] args) {
		
		String binaryA = "10010";
        String binaryB = "1101";
        
        int A = Integer.parseInt(binaryA);
        int B = Integer.parseInt(binaryB);
        
        String D= Integer.toString(A^B);
        int hammingDistance=0;
        System.out.println(D);
        
        for(int i=0; i< D.length();i++) {
        	System.out.println(D.charAt(i));
        	if (D.charAt(i)=='1')  hammingDistance+=1; 
        }
        
        System.out.println();		
        System.out.println(hammingDistance);

}
}
