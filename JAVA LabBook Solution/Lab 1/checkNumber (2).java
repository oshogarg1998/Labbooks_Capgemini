package com.cg.lab1;

import java.util.Scanner;

public class IncreasingNumber {
	
	public static boolean checkNumber(int num) {
		int a = num%10;
		num = num/10;
		while(num>0)
		{
			int b= num%10;
			if(a <b)
				return false;
			a = b;
			num = num/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int input = sc.nextInt();
		System.out.println(checkNumber(input));
		sc.close();
	}

}
