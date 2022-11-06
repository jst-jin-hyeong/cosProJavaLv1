import java.util.ArrayList;

public class ExamGraphAdjacencyList {
	public static void main(String[] args) {
		
		ArrayList<Integer[]> gl = new ArrayList<Integer[]>();
		
		gl.add(new Integer[]{1,2});
		gl.add(new Integer[]{2});
		gl.add(new Integer[]{2});		
						
		for(int i=0; i<gl.size(); i++) {
			for(int j=0; j<gl.get(i).length; j++) 
				System.out.print(gl.get(i)[j]+" ");  
			System.out.println();
		}
	}
}


