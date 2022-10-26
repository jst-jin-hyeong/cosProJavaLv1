import java.util.Iterator;
import java.util.LinkedList;

public class ExamLinkedList2 {
	public static void main(String[] args) {
		
		LinkedList<Integer> lnklist = new LinkedList<>();
			
		lnklist.add(1);
		lnklist.add(2);
		lnklist.add(0,10);
		
		Iterator<Integer> iter = lnklist.iterator();
		Integer v1;
		while(iter.hasNext()) {
			v1=iter.next();
			if (v1==1)
				iter.remove();
		}
		
		System.out.println(lnklist);
		
	
		
	}
}
