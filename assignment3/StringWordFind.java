package com.broadridge.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class StringWordFind 
{
	public static void main(String[] args) 
	{	
		String str;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = S.nextLine();

		if(str.contains("brown"))
		{
			System.out.println("Brown is Presnt in String");
		}
		
		else
		{
			System.out.println("Brown is NOT Presnt in String");

		}		
	}
}
