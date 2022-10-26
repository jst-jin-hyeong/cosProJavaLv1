import java.util.Stack;

public class ExamStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		while(!st.empty())
			System.out.println(st.pop());
	}

}
