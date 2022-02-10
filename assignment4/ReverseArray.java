package com.broadridge.assignment4;

import java.util.*;
import java.util.stream.*;
public class ReverseArray
{
    public static void main(String[] args) 
	{
    Integer[] intArray = {50,60,70,80,90,10,20,30,40};

    System.out.println("Original Array:");
    for(int i=0;i<intArray.length;i++)
         System.out.print(intArray[i] + "  ");
     
    System.out.println();
     
        System.out.println("Original Array printed in reverse order:");
         for(int i=intArray.length-1;i>=0;i--)
         System.out.print(intArray[i] + "  ");
    }
}