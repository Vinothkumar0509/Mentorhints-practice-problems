package javaDsabasics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a Number for factorial:");
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
	    int fact =1;
		for(int i=1 ;i<=x;i++)
		{
		 fact =fact*i;
		}
		System.out.println(fact);
	}

}
