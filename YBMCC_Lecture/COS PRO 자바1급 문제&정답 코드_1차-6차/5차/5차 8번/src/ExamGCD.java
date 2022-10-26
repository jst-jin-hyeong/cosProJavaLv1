
public class ExamGCD {
	//�ִ�����
	public int gcd(int a, int b, int c) {
		int answer=0;
		int i=1;
		while (i<=a && i<=b && i<=c) {
			if (a%i==0 && b%i==0 && c%i==0)
				answer=i;
			i+=1;
		}
		return answer;
	}
	
	//����� ����
	public int cmCnt(int a, int b, int c) {
		int answer=0;
		int i=1;
		while (i<=a && i<=b && i<=c) {
			if (a%i==0 && b%i==0 && c%i==0)
				answer+=1;
			i+=1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
    	ExamGCD sol = new ExamGCD();
    	int ret1 = sol.gcd(24,9,15);
    	System.out.println("�ִ������� " + ret1);   
    	
    	int ret2 = sol.cmCnt(24,9,15);	
    	System.out.println("����� ������ " + ret2); 
    }
}
