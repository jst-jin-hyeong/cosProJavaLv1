/*=======================================
    3�� 2��   3�� 1�� 2_initial_code.java
 ========================================*/

import java.util.*;

public class T_Solution2 {
    public boolean func_a(ArrayList<String> list, String s) {
		for (int i = 0; i < list.size(); i++)
			if (s.equals(list.get(i)))
				return true;
		return false;
	}

    public boolean func_b(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++)
			if (s.charAt(i) != s.charAt(length - i - 1))
				return false;
		return true;
	}
    
    public String func_c(ArrayList<String> palindromes, int k) {
        //Collections.sort(palindromes);
        palindromes.sort(Comparator.reverseOrder());
        
        for(int i=0; i<palindromes.size() ;i++)
        	System.out.println(palindromes.get(i) + "  ");
        if (palindromes.size() < k)
        	return "NULL";
        else
        	return palindromes.get(k-1);
    }

    public String solution(String s, int k) {
        ArrayList<String> palindromes = new ArrayList<String>();
        int length = s.length(); 
     
       // �κ� ���ڿ� �����-1
//        for (int startIdx = 0; startIdx < length; startIdx++) {
//            for (int endIdx = startIdx+1; endIdx <= length ; endIdx++) {
//                String subStr = s.substring(startIdx, endIdx);
//                System.out.print(subStr+ " ");
//            }
//            System.out.println();
//        }

        // �κ� ���ڿ� �����-2
      for (int startIdx = 0; startIdx < length; startIdx++) {
          for (int cnt = 1; cnt < length - startIdx + 1; cnt++) {
	          String subStr = s.substring(startIdx, startIdx + cnt);
	          System.out.print(subStr+ " ");
        }
       System.out.println();
      }
        
      
      
      
      
      
        
        
//        for (int startIdx = 0; startIdx < length; startIdx++) {
//            for (int cnt = 1; cnt < length - startIdx + 1; cnt++) {
//                String subStr = s.substring(startIdx, startIdx + cnt);
//             //   System.out.print(subStr+ " ");
//                if (func_b(subStr)) {
//                	if (func_a(palindromes, subStr) == false)
//                		palindromes.add(subStr);
//                }
//            }
//            System.out.println();
//        }
        
//      if (func_@@@(@@@)) {
//    	if (func_@@@(@@@) == false)
  // 		palindromes.add(subStr);
//    }
        
        
        
         String answer = func_c(palindromes,k);
         return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	T_Solution2 sol = new T_Solution2();
        String s1 = new String("abcba");
        int k1 = 4;
        String ret1 = sol.solution(s1, k1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�. 
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        String s2 = new String("ccddcc");
        int k2 = 7;
        String ret2 = sol.solution(s2, k2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�. 
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}