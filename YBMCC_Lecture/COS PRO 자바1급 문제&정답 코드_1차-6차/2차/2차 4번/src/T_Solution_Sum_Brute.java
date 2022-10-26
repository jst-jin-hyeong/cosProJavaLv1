

class T_Solution_Sum_Brute {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
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

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        T_Solution_Sum_Brute sol = new T_Solution_Sum_Brute();
        int[] arr = {1, 2, 3, 8, 2, 4};
        int K = 9;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
        
        int[] arr2 = {1, 5, 3, 8, 2, 4, 9, 6};
        int K2 = 11;
        int ret2 = sol.solution(arr2, K2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
