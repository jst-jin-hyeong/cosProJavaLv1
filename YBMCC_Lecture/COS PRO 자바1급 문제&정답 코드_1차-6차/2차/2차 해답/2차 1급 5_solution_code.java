
/*=======================================
   2Тї 1Бо 5_solution_code.java
 ========================================*/

class Solution {
    public int solution(int[] arr) {
        int dp[] = new int[arr.length];
        for(int i = 0; i < dp.length; ++i)
            dp[i] = 1;
        for(int i = 1; i < arr.length; ++i)
            if(arr[i] > arr[i-1])
                dp[i] = dp[i-1] + 1;
        int answer = 0;
        for(int i = 0; i < arr.length; ++i)
            answer = Math.max(answer, dp[i]);
        return answer;
    }
}
