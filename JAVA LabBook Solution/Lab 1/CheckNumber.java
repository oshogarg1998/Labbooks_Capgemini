package com.cg.lab1;

import java.util.Scanner;

public class CheckNumber {
	
	public static boolean checkNumber(int num) 
    { 
        if (num == 0) 
            return false; 
          
        while (num != 1) 
        { 
            if (num % 2 != 0) 
                return false; 
            num = num / 2; 
        } 
        return true; 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int input = sc.nextInt();
		System.out.println(checkNumber(input));
		sc.close();
	

	}

}
