package com.broadridge.assignment1;

public class FibonacciSeries 
{
    public static void main(String[] args) 
	{
		  int i1= 0;
		  int i2= 1;
		  int i3= 0;
		  System.out.println(i1);
		  System.out.println(i2);
		  for (int i4=1;i4<=10;i4++) 
		  {
			 i3 = i1+i2;
			 i1=i2;
			 i2=i3;
			 System.out.println(i3);
		  }
    }
}
