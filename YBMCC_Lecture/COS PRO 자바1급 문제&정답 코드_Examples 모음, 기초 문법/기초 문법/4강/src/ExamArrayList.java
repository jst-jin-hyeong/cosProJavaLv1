import java.util.ArrayList;

public class ExamArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist = new ArrayList<>();
			
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(0,10);
		
		System.out.println(arrlist);
		
		for(int i=0; i<arrlist.size();i++) {
			System.out.print(arrlist.get(i)+"  ");
		}
		System.out.println();
		
		arrlist.remove(0);
		
		for(int i=0; i<arrlist.size();i++) {
			System.out.print(arrlist.get(i)+"  ");
		}
		
	
		
	}
}
