
/*=======================================
   2?? 1?? 7_solution_code.java
 ========================================*/

class Solution {
    public int solution(int money) {
        int coin[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int counter = 0;
        int idx = coin.length - 1;
        while (money > 0){
            counter += money / coin[idx];
            money %= coin[idx];
            idx -= 1;
        }
        return counter;
    }
}