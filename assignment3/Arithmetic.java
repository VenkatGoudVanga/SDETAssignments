package com.broadridge.assignment3;

public class Arithmetic 
{
	public static void main(String[] args)
	{
		int num1,num2,num3;
		
		num1=30;
		num2=0;
		
		try{
				
			num3=num1/num2; 
				
			System.out.println("Result is: " + num3);
			
			}
			
		catch(ArithmeticException ae) 
		{
			ae.printStackTrace();
			ae.toString();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
			
	}
}	
