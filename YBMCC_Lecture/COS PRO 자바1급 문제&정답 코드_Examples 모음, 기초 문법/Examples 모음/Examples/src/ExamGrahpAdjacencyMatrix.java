import java.util.ArrayList;

public class ExamGrahpAdjacencyMatrix {
	public static void main(String[] args) {
		
		int[][] gm = new int[][] {
					{0,1,1},
					{0,0,1},
					{0,0,1}
			        };
			        
	        
		
		for(int i=0; i<gm.length;i++) {	
			for(int j=0; j<gm[i].length ;j++) 
				System.out.print(gm[i][j]+"  ");
			System.out.println();
		}
	}
}
