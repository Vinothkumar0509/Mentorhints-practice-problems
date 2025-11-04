package javaDsabasics;

public class LargestElementInArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int max1 = arr1[0];
		int[] arr2 = {10,3,5,7,2,12};
		int max2 =arr2[0];
		for(int i =0;i<arr1.length;i++)
		{
			if(arr1[i]>max1)
			{
			  max1= arr1[i];	
			}
		}
		System.out.println(max1);
		
		for(int i =0;i<arr2.length;i++)
		{
			if(arr2[i]>max2)
			{
			  max2 = arr2[i];	
			}
		}
		System.out.println(max2);
	}

}
