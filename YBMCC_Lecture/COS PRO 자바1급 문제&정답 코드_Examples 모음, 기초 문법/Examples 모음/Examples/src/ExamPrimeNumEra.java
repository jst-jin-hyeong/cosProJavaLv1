import java.time.Duration;
import java.time.LocalTime;

public class ExamPrimeNumEra{

	public static void main(String[] args) {
	  int n=100000;
      boolean arr[] = new boolean[n+1];
      LocalTime startTime = LocalTime.now();
      //n���� ��ҿ� True �� �ʱⰪ ����
      for(int i=2; i<=n;i++)
    	  arr[i]=true;
      
      for(int i=2; i<=Math.sqrt(n); i++) {
    	  if(arr[i]==true) {                //i�� �Ҽ��� ���
    		  for(int j=(i+i);j<=n;j=j+i) { //i�� ������� false�� ����
    		      arr[j]=false;    	
    		  }
    	  } 
      }
      //�Ҽ� �� ���, �迭�� �ε��� ��ȣ�� Ȱ��
      for(int i=2;i<=n;i++) {
    	  if (arr[i]==true)
          	  System.out.println(i);
        }
      
      LocalTime endTime=LocalTime.now();
      
      Duration d = Duration.between(startTime, endTime);
      System.out.println(d.getSeconds()+"."+d.getNano());
	}
}


//System.out.println(i+" "+j+" "+arr[j]);
