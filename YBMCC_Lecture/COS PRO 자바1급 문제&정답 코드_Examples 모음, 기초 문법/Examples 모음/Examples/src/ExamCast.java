
public class ExamCast {

	public static void main(String[] args) {
		
		int num=32;
		String str;
		
		// 숫자를 문자열로 바꾸기
		str =String.valueOf(num);  //int,float.. 여러 타입 가능
		str= Integer.toString(num); //int만 가능
		str=""+num;
		str=num+"";
		
		System.out.println(str.getClass().getName());
		
		//문자열을 숫자로 바꾸기 		
		num=Integer.valueOf(str).intValue();  //반환 Integer              
		num=Integer.parseInt(str);            //반환 int
		
		double numDouble;
		
		numDouble=Double.valueOf(str).doubleValue();
		numDouble=Double.parseDouble(str);
		
	}

}
