import java.util.Arrays;

/*=======================================
   3차 1급 3_solution_code.java 제안2
   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 드립니다.
   (더 좋은 알고리즘으로 구현 바랍니다.)
 ========================================*/

class T_Solution3 {
    public int solution(String[] bishops) {
        int answer = 0;
        int[] dx= {1,1,-1,-1};
        int[] dy= {1,-1,-1,1};
     
        int[][] chess_map = new int[8][8];       

        for (int i =0; i<bishops.length;i++) {    
        	for (int j=0 ; j <4; j++) {
        		String temp_x= bishops[i].substring(0,1);  //D5에서 D 문자열 추출
              	int x=(int)(temp_x.charAt(0))-(int)('A') ; //D 문자열을 char로 변환 후 
              	                                           // ascii 코드값 추출하여 A와의 차이 구하기
            	String temp_y= bishops[i].substring(1);    //D5에서 5 문자열 추출
              	int y=Integer.parseInt(temp_y)-1 ;         //5 문자열을 숫자로 변환 
              	
              	while(0<=x && x<8 && 0<=y && y<8) {
              		chess_map[y][x] = 1;
              		x = x + dx[j];
              		y = y + dy[j];
              	}
        	}
        }
        
        for(int k = 0; k < chess_map.length;k++) {
        	System.out.println(Arrays.toString(chess_map[k]));
   			for(int h = 0;h < chess_map[k].length;h++) {
   				if (chess_map[k][h]==0)
   					answer += 1;
			}
		}
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        T_Solution3 sol = new T_Solution3();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}


