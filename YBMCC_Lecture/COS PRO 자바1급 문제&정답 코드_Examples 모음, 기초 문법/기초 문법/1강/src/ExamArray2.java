
public class ExamArray2 {

	public static void main(String[] args) {
		
		//=================================
		
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		//int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
		

		//=================================
		
		int[][] a = new int[4][4];
		int num=1;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				a[i][j]=num;
				num++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		int[] ar={1,2,3,4,5};

		for(int e:ar){
			System.out.println(e);
		}


		
	}

}
