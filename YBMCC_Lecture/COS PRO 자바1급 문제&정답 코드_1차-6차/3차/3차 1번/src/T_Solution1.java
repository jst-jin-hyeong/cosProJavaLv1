import java.util.Arrays;

/*=======================================
    3차 1번   3차 1급 1_initial_code.java
 ========================================*/

class T_Solution1 {
    int[] func_a(int[] arr) {
    	   	
        int length = arr.length;
        int[] ret = new int[length*2];
        System.arraycopy(arr, 0, ret, 0, length);
        System.arraycopy(arr, 0, ret, length, length);
        return ret;
    }
    
    
    boolean func_b(int[] first, int[] second){
    	int[] tempfirst, tempsecond;
    	tempfirst =Arrays.copyOf(first,first.length);
    	tempsecond =Arrays.copyOf(second,second.length);
    	Arrays.sort(tempfirst);
    	Arrays.sort(tempsecond);
        	
    	if (Arrays.equals(tempfirst,tempsecond))
            return true;
        return false;
    }
    
    boolean func_c(int[] first, int[] second){
	    int length = second.length;
	    int[] temp;
	    
	    for(int i = 0; i < length; i++){
	        temp =Arrays.copyOfRange(first, i,length+i);
	        if (Arrays.equals(temp,second))
	            return true;
	    }
	    return false;
    }
    
    public boolean solution(int[] arrA, int[] arrB) {
        if(arrA.length != arrB.length)
            return false;
        if(func_b(arrA,arrB)) {
            int[] arrAtemp = func_a(arrA);
            if(func_c(arrAtemp,arrB))
                return true;
        }
        return false;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        T_Solution1 sol = new T_Solution1();
        int[] arrA1 = {1, 2, 3, 4};
        int[] arrB1 = {3, 4, 1, 2};
        boolean ret1 = sol.solution(arrA1, arrB1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arrA2 = {1, 2, 3, 4};
        int[] arrB2 = {1, 4, 2, 3};
        boolean ret2 = sol.solution(arrA2, arrB2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}