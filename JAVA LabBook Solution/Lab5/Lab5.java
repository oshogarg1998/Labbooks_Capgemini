package com.cg.lab5;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter red or yellow or green to check Signal");
		String choice=sc.nextLine();
		switch(choice) 
		{
			case "Red": 
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("Ready");
				break;
			case "Green":
				System.out.println("Go");
				break;
			default: 
				System.out.println("Wrong Choice");
		}
		
		sc.close();

	}

}
