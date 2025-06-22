package com.stringtest;

public class StringTest01 {
public static void main(String[] args) {
	
	
	//System.out.println(reverseString("sachin"));
	reverse("india");
}
public static String reverseString(String s)
{
	
	 if (s.isEmpty()) {
         return s;
     }
	 
     return reverseString(s.substring(1)) + s.charAt(0);
 }

static void reverse(String str) 
{ 
    //If the string is null or consists of single character
    //then print the entered string 
    if ((str==null)||(str.length() <= 1)) 
       System.out.println(str); 
    else
    { 
        //If string consists of multiple strings
        System.out.print(str.charAt(str.length()-1)); 
        //Call the function recursively to reverse the string
        reverse(str.substring(0,str.length()-1)); 
    }         
} 

}
