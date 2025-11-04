package javaDsabasics;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int row =3;
		int col =3;
		int[][] a1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] a2= {{1,4,7},{2,5,8},{3,6,9}};
		int[][] a3 = new int[row][col];
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
	 		{
	 		 a3[i][j] = a1[i][j] * a2[i][j];
	 		}
		}
		for(int i=0; i< a3.length;i++)
	 	{
			for(int j=0;j<a3[i].length;j++)
	 		{
	 			System.out.print(a3[i][j]+" ");
	 		}
	 		System.out.println();
	 	}
		
		
		
	}

}
