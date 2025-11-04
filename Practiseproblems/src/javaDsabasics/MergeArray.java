package javaDsabasics;

public class MergeArray {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {50,60,70,80};
		int mergedsize=arr1.length+arr2.length;
		int mergedArray[] = new int[mergedsize];
		
		
		for(int i=0;i<arr1.length;i++)
		{
			mergedArray[i] = arr1[i];
	   }
		for(int i =0;i<arr2.length;i++)
		{
			mergedArray[arr1.length+i]= arr2[i];
		}
		for(int i =0;i<mergedsize;i++)
		{
			System.out.println(mergedArray[i]);
		}

}
}
