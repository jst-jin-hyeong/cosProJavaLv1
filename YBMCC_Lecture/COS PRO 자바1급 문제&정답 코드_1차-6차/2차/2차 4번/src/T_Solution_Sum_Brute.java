

class T_Solution_Sum_Brute {
    public int solution(int[] arr, int K) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 0;
        int n=arr.length;
        
        for (int p=0; p<n-2;p++) {
        	for (int q=p+1; q<n-1 ; q++) {
        		for (int r=q+1;r<n ; r++ ) {
        			if((arr[p]+arr[q]+arr[r]) == K) {
        				answer+=1;
        				System.out.println(arr[p] + " " +arr[q]+" "+ arr[r]);
        			}
        		}
        	}
        }
        
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        T_Solution_Sum_Brute sol = new T_Solution_Sum_Brute();
        int[] arr = {1, 2, 3, 8, 2, 4};
        int K = 9;
        int ret = sol.solution(arr, K);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
        
        int[] arr2 = {1, 5, 3, 8, 2, 4, 9, 6};
        int K2 = 11;
        int ret2 = sol.solution(arr2, K2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
