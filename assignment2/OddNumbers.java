package com.broadridge.assignment2;

public class OddNumbers 
{

	public static void main(String[] args) 
	{
		int stNum=79,edNum=187;
		System.out.println("Odd number from "+stNum+ " to " +edNum+ " are :" );
		for(int i=stNum; i<=edNum;i++) 
		   {
			  if(i%2==1)
			  {
				System.out.println(i +"");
			  }
			}
	}
}

