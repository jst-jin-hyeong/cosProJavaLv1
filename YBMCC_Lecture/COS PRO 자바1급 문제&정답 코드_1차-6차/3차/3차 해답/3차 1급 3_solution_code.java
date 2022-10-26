import java.util.Arrays;

/*=======================================
   3차 1급 3_solution_code.java
   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 드립니다.
   (더 좋은 알고리즘으로 구현 바랍니다.)
 ========================================*/

class Solution {
    public int solution(String[] bishops) {
        int answer = 0;
        int x, y, dx, y_up,y_dn;       
        int[][] chess_map = new int[8][8];       
        for (int i =0; i<chess_map.length;i++)         // 모두 1로 초기화
        	Arrays.fill(chess_map[i], 1);
     
        for (int i =0; i<bishops.length;i++) {
        	String temp_x= bishops[i].substring(0,1);  //D5에서 D 문자열 추출
          	x=(int)(temp_x.charAt(0))-(int)('A') ;     //D 문자열을 char로 변환 후 
          	                                           // ascii 코드값 추출하여 A와의 차이 구하기
        	String temp_y= bishops[i].substring(1);    //D5에서 5 문자열 추출
          	y=Integer.parseInt(temp_y)-1 ;             //5 문자열을 숫자로 변환  
        	
          	chess_map[y][x]=0;       	
          	dx=x-1;
          	y_up=y;
          	y_dn=y;        	
          	while (dx>=0) {
          		y_up+=1;
          		y_dn-=1;
          		if (y_up <8) 
          			chess_map[y_up][dx]=0;
          		if (y_dn>=0)
          			chess_map[y_dn][dx]=0;
          		dx-=1;   
          	}       	
          	dx=x+1;
          	y_up=y;
          	y_dn=y;
          	while(dx<8) {
          		y_up+=1;
          		y_dn-=1;
          		if (y_up <8)
          			chess_map[y_up][dx]=0;
          		if (y_dn>=0)
          			chess_map[y_dn][dx]=0;
          		dx+=1;            		
          	}
          	answer=0;
          	for(int k = 0; k < chess_map.length;k++) {
       			for(int h = 0;h < chess_map[k].length;h++) {
       				if (chess_map[k][h]==1)
       					answer += 1;
    			}
    		}
         }  
        return answer;
    }
