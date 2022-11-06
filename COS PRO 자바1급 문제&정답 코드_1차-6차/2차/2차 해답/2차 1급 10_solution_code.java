
/*=======================================
   2Тї 1Бо 10_solution_code.java
 ========================================*/

class Solution {
    public String solution(String s) {
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '0' && s.charAt(i+1) != '0')
                answer += "0";
            else if(s.charAt(i) == '1')
                answer += "1";
        }
        return answer;
    }
}