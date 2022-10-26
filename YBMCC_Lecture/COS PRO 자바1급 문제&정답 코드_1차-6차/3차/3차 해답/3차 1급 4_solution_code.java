
/*=======================================
   3�� 1�� 4_solution_code.java
   ybmit.com ����Ʈ�� ���� ���Ͽ��� ������ ���õǾ� ���� �ʽ��ϴ�.
   �Ʒ��� ���� ������ ���� �帳�ϴ�.
 ========================================*/

class Solution {
	
	int overlap(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
		int over_len = 0;
		
		for ( int i =1 ; i <= len ; i++) {
			String f = s1.substring(s1.length() - i);
			String s = s2.substring(0,i);

			if (f.equals(s))
				over_len = i;
		}
		return s1.length() + s2.length() - over_len;
		
	}
	
    public int solution(String s1, String s2) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 0;  
        answer = Math.min(overlap(s1,s2), overlap(s2,s1));
        return answer;
    }
    

}

