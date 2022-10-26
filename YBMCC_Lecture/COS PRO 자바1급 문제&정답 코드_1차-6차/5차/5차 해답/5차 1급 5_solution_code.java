
/*=======================================
   5Тї 1Бо 5_solution_code.java
 ========================================*/

import java.util.Arrays;

class Solution {
    public int solution(int[] enemies, int[] armies) {
        int answer = 0;
        
        Arrays.sort(enemies);
        Arrays.sort(armies);
        int i = 0, j = 0;
        while(i < enemies.length && j < armies.length) {
        	if(enemies[i] <= armies[j]) {
        		answer++;
        		i++;
        		j++;
        	} else {
        		j++;
        	}
        }     
        return answer;
    }
}