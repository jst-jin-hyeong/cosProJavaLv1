
public class ExamEUC {
	//��Ŭ���� ȣ���� 
	public int gcdEuc(int a, int b) {
		int r=a%b;
		System.out.println(a+" "+b+" "+r);
		while (r>0) {
			a=b;
			b=r;
			r=a%b;
			System.out.println(a+" "+b+" "+r);
		}
		return b;
	}
	
	//��Ŭ���� ȣ����-����Լ�
	public int gcdEuc2(int a, int b) {
		if (b==0)
			return a;
		else {
			System.out.println(a+" "+b+" "+a%b);
			return gcdEuc2(b,a%b);
		}
	}
	
	public static void main(String[] args) {
    	ExamEUC sol = new ExamEUC();
    	int ret1 = sol.gcdEuc(72,27);
    	System.out.println(ret1);   
    	
    	int ret2 = sol.gcdEuc2(72,27);	
    	System.out.println(ret2); 
    }
}
