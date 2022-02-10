package com.broadridge.assignment4;

import java.util.HashSet;

public class CopyElementsOfHashSetToArrayExample 
{

	public static void main(String[] args) 
	{
	    HashSet hSet = new HashSet();
	   
	    hSet.add(new Integer("10"));
	    hSet.add(new Integer("20"));
	    hSet.add(new Integer("30"));	   
	    Object[] objArray = hSet.toArray();	   
	    System.out.println("HashSet elements are copied into an Array. ");
	    for(int index=0; index < objArray.length ; index++)
	      System.out.println(objArray[index]);
	 }
}
	 