import java.util.LinkedList;

public class ExamArrayLinked {

	public static void main(String[] args) {
		LinkedList<Integer> lnklist = new LinkedList<>();
		
		lnklist.add(1);
		lnklist.add(2);
		lnklist.add(0,10);
		
		System.out.println(lnklist);
		
		for(int i=0; i<lnklist.size();i++) {
			System.out.print(lnklist.get(i)+"  ");
		}
		System.out.println();
		
		lnklist.remove(0);
		
		for(int i=0; i<lnklist.size();i++) {
			System.out.print(lnklist.get(i)+"  ");
		}

	}

}
