/*=======================================
   5�� 8��   5�� 1�� 8_initial_code.java
 ========================================*/
class Solution {
	public int func_a(int a, int b) {
		int mod = a % b;

		while(mod > 0) {
			a = b;
			b = mod;
			mod = a % b;
		}
		return b;
	}

	public int func_b(int n) {
		int answer = 0;

		for(int i = 1; i <= n; i++) {
			if(func_@@@(@@@))
				answer++;
		}
		return answer;
	}

	public boolean func_c(int p, int q) {
		if(p % q == 0)
			return true;
		else
			return false;
	}

	public int solution(int a, int b, int c) {
		int answer = 0;
		int gcd = func_@@@(func_@@@(@@@)@@@);
		answer = func_@@@(@@@);
		return answer;
	}

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = 24;
		int b = 9;
		int c = 15;
		int ret = sol.solution(a, b, c);
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
	}
}
