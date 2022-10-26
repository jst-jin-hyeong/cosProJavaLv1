
public class ExamRecursive {
    public void recursive(int i) {
        if (i==3)
        	return;
        
        System.out.println(i+"번째 재귀함수 실행 "+(i+1)+"번째 재귀함수 호출");
        recursive(i+1);
        System.out.println(i+"번째 재귀함수 종료");
    }
	
	public static void main(String[] args) {
		ExamRecursive recur= new ExamRecursive();
		recur.recursive(1);
	}
}
