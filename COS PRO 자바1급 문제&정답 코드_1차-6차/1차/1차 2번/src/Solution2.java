

/*=======================================
1차 1급 2_solution_code.java
정답지 파일을 그대로 가져다 놓았습니다.
정답지처럼 11,12라인의 dx,dy를 서로 바꾸면 정상 출력됩니다.
========================================*/

class Solution2{
 int[][] pane;
 int dx[] = {0, 1, 0, -1};
 int dy[] = {1, 0, -1, 0};
 boolean inRange(int i, int j, int n){
     return 0 <= i && i < n && 0 <= j && j < n;
 }
 public int solution(int n){
     pane = new int[n][n];
     int ci = 0;
     int cj = 0;
     int num = 1;
     while(inRange(ci, cj, n) && pane[ci][cj] == 0){
         for(int k = 0; k < 4; k++){
             if(!inRange(ci, cj, n) || pane[ci][cj] != 0) break;
             while(true){
                 pane[ci][cj] = num++;
                 int ni = ci + dy[k];
                 int nj = cj + dx[k];
                 if(!inRange(ni, nj, n) || pane[ni][nj] != 0){
                     ci += dy[(k + 1) % 4];
                     cj += dx[(k + 1) % 4];
                     break;
                 }
                 ci = ni;
                 cj = nj;
             }
         }
     }
     
     for(int i = 0; i < n; i++) {
     	for(int j=0; j<n; j++) {
     		System.out.print(pane[i][j]+"\t");
          }
     	System.out.println();
     }
     
     int ans = 0;
     for(int i = 0; i < n; i++) ans += pane[i][i];
     return ans;
 }


    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}