/*=======================================
   4�� 1��   4�� 1�� 1_initial_code.java
   ���Ʈ ���� ��� ���
 ========================================*/

import java.util.*;

public class T_Solution1 {
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;
  
    public int solution(String word) {
        int answer = 0;
        words  = new ArrayList<String>();        
        words.add("");
        
        for (int i1 = 0; i1 < 5; i1++) {
        	words.add(vowels[i1]);  
        	for (int i2 = 0; i2 < 5; i2++) {
            	words.add(vowels[i1]+vowels[i2]);  
            	for (int i3 = 0; i3 < 5; i3++) {
                	words.add(vowels[i1]+vowels[i2]+vowels[i3]); 
                	for (int i4 = 0; i4 < 5; i4++) {
                    	words.add(vowels[i1]+vowels[i2]+vowels[i3]+vowels[i4]);
                    	for (int i5 = 0; i5 < 5; i5++) {
                        	words.add(vowels[i1]+vowels[i2]+vowels[i3]+vowels[i4]+vowels[i5]);  
                         }
                    }
                }
            }
        }
  
        for(int i=1; i<words.size();i++)
        	System.out.println(words.get(i));
        
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� �ڵ��Դϴ�. �Ʒ����� �߸��� �κ��� ������, ���� �ڵ常 �����ϼ���.
    public static void main(String[] args) {
        T_Solution1 sol = new T_Solution1();
        String word1 = new String("AAAAE");
        int ret1 = sol.solution(word1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

//        String word2 = new String("AAAE");
//        int ret2 = sol.solution(word2);
//
//        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
//        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}