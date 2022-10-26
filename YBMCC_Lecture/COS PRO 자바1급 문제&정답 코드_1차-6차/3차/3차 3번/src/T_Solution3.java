import java.util.Arrays;

/*=======================================
   3�� 1�� 3_solution_code.java ����2
   ybmit.com ����Ʈ�� ���� ���Ͽ��� ������ ���õǾ� ���� �ʽ��ϴ�.
   �Ʒ��� ���� ������ ���� �帳�ϴ�.
   (�� ���� �˰������� ���� �ٶ��ϴ�.)
 ========================================*/

class T_Solution3 {
    public int solution(String[] bishops) {
        int answer = 0;
        int[] dx= {1,1,-1,-1};
        int[] dy= {1,-1,-1,1};
     
        int[][] chess_map = new int[8][8];       

        for (int i =0; i<bishops.length;i++) {    
        	for (int j=0 ; j <4; j++) {
        		String temp_x= bishops[i].substring(0,1);  //D5���� D ���ڿ� ����
              	int x=(int)(temp_x.charAt(0))-(int)('A') ; //D ���ڿ��� char�� ��ȯ �� 
              	                                           // ascii �ڵ尪 �����Ͽ� A���� ���� ���ϱ�
            	String temp_y= bishops[i].substring(1);    //D5���� 5 ���ڿ� ����
              	int y=Integer.parseInt(temp_y)-1 ;         //5 ���ڿ��� ���ڷ� ��ȯ 
              	
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

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        T_Solution3 sol = new T_Solution3();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}


