import java.util.*;

public class ExamQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		while(!q.isEmpty())
			System.out.println(q.poll());
	}

}
