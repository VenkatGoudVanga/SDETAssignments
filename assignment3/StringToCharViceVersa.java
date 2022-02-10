package com.broadridge.assignment3;

public class StringToChar 
{
	public static void main(String[] args) 
	{
		
        String str = "Venkat Goud Vanga";
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) 
        { 
            ch[i] = str.charAt(i); 
        }
        for (char c : ch)
        { 
            System.out.println(c); 

        }
		
		char[] charr = {'v', 'e', 'n', 'k', 'a', 't', 'g', 'o', 'u', 'd', 'v', 'a', 'n', 'g', 'a'};
		String charstr = String.valueOf(charr);
		System.out.println(charstr);
	}

}

