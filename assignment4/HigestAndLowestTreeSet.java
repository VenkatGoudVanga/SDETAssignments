package com.broadridge.assignment4;

import java.util.*;

public class HigestAndLowestTreeSet 
{
    public static void main(String args[])
    {
        TreeSet<Integer> set = new TreeSet<Integer>(); 
        set.add(25);
        set.add(67);
        set.add(11);
        set.add(36);
        set.add(10);
        set.add(235);
        set.add(88);
        set.add(1);
        
        System.out.println("Elements of the treeset are: " + set);        
        System.out.println("Highest Value: " + set.pollLast());         
        System.out.println("Lowest Value: " + set.pollFirst());                                                                
    }       
}

