
public class ExamCast {

	public static void main(String[] args) {
		
		int num=32;
		String str;
		
		// ���ڸ� ���ڿ��� �ٲٱ�
		str =String.valueOf(num);  //int,float.. ���� Ÿ�� ����
		str= Integer.toString(num); //int�� ����
		str=""+num;
		str=num+"";
		
		System.out.println(str.getClass().getName());
		
		//���ڿ��� ���ڷ� �ٲٱ� 		
		num=Integer.valueOf(str).intValue();  //��ȯ Integer              
		num=Integer.parseInt(str);            //��ȯ int
		
		double numDouble;
		
		numDouble=Double.valueOf(str).doubleValue();
		numDouble=Double.parseDouble(str);
		
	}

}
