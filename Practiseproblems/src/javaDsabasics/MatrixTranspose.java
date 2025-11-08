package javaDsabasics;

public class MatrixTranspose {
	public static void main(String[] args) {

		int[][] arr1 = {{1,2,3},
				        {4,5,6},
				        {7,8,9}};
		int[][] arr2 = {{1,4,7},
				{2,5,8},
				{3,6,9}};
		
		int row = arr1.length;
		int col = arr1[0].length;
		
		int[][] arr3 = new int[col][row];
		for(int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr3[j][i] = arr1[i][j];
			}
		}
		
		System.out.println("Transpose of Matrix");
		
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		int row1 = arr2.length;
		int col1 = arr2[0].length;
		
		int[][] arr4 = new int[col][row];
		for(int i =0;i<row1;i++)
		{
			for(int j =0;j<col1;j++)
			{
				arr4[j][i] = arr2[i][j];
			}
		}
		
		System.out.println("Transpose of Matrix");
		
		for(int i=0;i<col1;i++)
		{
			for(int j=0;j<row1;j++)
			{
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
