package com.broadridge.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlphabetic 
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Venkat");
		names.add("Vijay");
		names.add("Mahesh");
		names.add("Vani");
		names.add("Joshi");
		names.add("Shiva");
		Collections.sort(names);
	    System.out.println(names);
	}

}
