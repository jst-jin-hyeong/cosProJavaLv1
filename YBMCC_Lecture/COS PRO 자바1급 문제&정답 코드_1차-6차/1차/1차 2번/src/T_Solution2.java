
/*=======================================
다른 코딩 제안 1차 2번   1차 1급 2_initial_code.java
========================================*/

//You may use import as below.
//import java.util.*;



class T_Solution2{

int[][] pane;

int di[] = {0, 1, 0, -1};
int dj[] = {1, 0, -1, 0};

boolean inRange(int i, int j, int n){
    return 0 <= i && i < n && 0 <= j && j < n;
}

public int solution(int n){
    pane = new int[n][n];
    int ci = 0;
    int cj = 0;
    int num = 1;
    int k=0;
    
    while(inRange(ci, cj, n) && pane[ci][cj] == 0){    
                pane[ci][cj] = num++;
                int ni = ci + di[k];
                int nj = cj + dj[k];
                if(!inRange(ni, nj, n) || pane[ni][nj] != 0) {
                	k=(k + 1) % 4;
                }
                ci += di[k];
                cj += dj[k];                       
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
    T_Solution2 sol = new T_Solution2();
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