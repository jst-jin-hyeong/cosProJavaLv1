
public class ExamRecursive {
    public void recursive(int i) {
        if (i==3)
        	return;
        
        System.out.println(i+"��° ����Լ� ���� "+(i+1)+"��° ����Լ� ȣ��");
        recursive(i+1);
        System.out.println(i+"��° ����Լ� ����");
    }
	
	public static void main(String[] args) {
		ExamRecursive recur= new ExamRecursive();
		recur.recursive(1);
	}
}
