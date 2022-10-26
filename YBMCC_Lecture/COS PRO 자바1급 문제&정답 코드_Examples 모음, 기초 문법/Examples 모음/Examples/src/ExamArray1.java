import java.util.Arrays;
import java.util.Collections;


public class ExamArray1 {
public static void main(String[] args) {


	int[] k1= new int[3];
	//int[] k1= {1,2,3};
	
	for(int i=0; i<k1.length ; i++) {
		k1[i]=10;
		System.out.print(k1[i]+"\t");
	}
	
	System.out.println();
	
	
	int[] k2= new int[3];
	Arrays.fill(k2,20);
	System.out.print(k2[0]+"\t");
	System.out.print(k2[1]+"\t");
	System.out.println(k2[2]);
	
	int[] k3= new int[] {49,5,42};
	System.out.println("오름차순");
	Arrays.sort(k3,0,2);
	System.out.print(k3[0]+"\t");
	System.out.print(k3[1]+"\t");
	System.out.println(k3[2]);
	
	Integer [] k4= {49,5,42};
	Arrays.sort(k4,Collections.reverseOrder());
	System.out.println("내림차순");
	System.out.print(k4[0]+"\t");
	System.out.print(k4[1]+"\t");
	System.out.println(k4[2]);
	
	
	
	int[] ar={1,2,3,4,5};

	for(int e:ar){
		System.out.println(e);
	}

}
}

