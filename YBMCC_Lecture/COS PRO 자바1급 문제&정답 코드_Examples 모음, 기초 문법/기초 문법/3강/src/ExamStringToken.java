import java.util.StringTokenizer;


public class ExamStringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("12:25:30",":");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

