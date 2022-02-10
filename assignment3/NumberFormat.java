package com.broadridge.assignment3;

import java.util.*;

public class NumberFormat 
{
	
	public static void main( String[] arg)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your age : ");
		age = Integer.parseInt(sc.next());
		System.out.println("Your age is : " +age);
	}
}