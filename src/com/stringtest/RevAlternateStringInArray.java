package com.stringtest;

public class RevAlternateStringInArray {

public static void main(String[] args) {
	String str="abi akash akki ashok ravi mani sunny aftab";
	
	String[] s=str.split("\\s");
    for(int i=0;i<s.length;i++)
    {
        
        if(i%4==0 || i ==0) {
            
        System.out.print(reverseString(s[i]));
        }
        else
        {
            System.out.print(" "+s[i]+" ");
        }
    }
			
	
}

public static String reverseString(String s)
{
	
	 if (s.isEmpty()) {
         return s;
     }
	 
     return reverseString(s.substring(1)) + s.charAt(0);
 }

}

