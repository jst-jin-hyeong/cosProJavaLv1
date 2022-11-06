import java.time.Duration;
import java.time.LocalTime;

public class ExamPrimeNumEra{

	public static void main(String[] args) {
	  int k=100;
      boolean arr[] = new boolean[k+1];
      LocalTime startTime=LocalTime.now();
      //k���� ��ҿ� True �� �ʱⰪ ����
      for(int i=2; i<=k;i++)
    	  arr[i]=true;
      
      //����� �ش��ϴ� ������ false�� ��� �����
      for(int n=2; n<=Math.sqrt(k); n++) {   //2���� ��k ���� �ݺ� 
    	  if(arr[n]==true) {                //n�� �Ҽ��� ���
    		  for(int j=(n+n);j<=k;j=j+n) { //n�� ������� false�� ����
    		      arr[j]=false;    	
    		  }
    	  } 
      }
      
      //�Ҽ� �� ���, �迭�� �ε��� ��ȣ�� Ȱ��
      for(int i=2;i<=k;i++) {
    	  if (arr[i]==true)
          	  System.out.println(i);
      }
      
      LocalTime endTime=LocalTime.now();
      
      Duration d = Duration.between(startTime, endTime);
      System.out.println(d.getSeconds()+"."+d.getNano());
	}
}


//System.out.println(i+" "+j+" "+arr[j]);
