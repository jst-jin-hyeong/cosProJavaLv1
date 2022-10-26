
/*=======================================
    2차 10번   2차 1급 10 T_Solution10.java
 ========================================*/
class T_Solution10 {
    public String solution(String s) {
        String answer = "" + s.charAt(0);
        for(int i = 1; i < s.length(); ++i){
            if ( (s.charAt(i-1)=='1') || (s.charAt(i)=='1') )
            	answer+=s.charAt(i);
        
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        T_Solution10 sol = new T_Solution10();
        String s = "101100011100";
        String ret = sol.solution(s);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}