package com.stringtest;

import java.util.stream.IntStream;

public class String_SuibStringTest {
	public static void main(String[] args) {

		// System.out.println(regString("Sachin sharma"));
		String str = "Sachin";
//		System.out.println(str.strip());
//		System.out.println(str.contentEquals("Sachin"));

//	System.out.println(str.isBlank());
//	System.out.println(str.isEmpty());
		System.out.println(revString01(str));
	}

	public static String regString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return regString(str.substring(1)) + str.charAt(0);

		}
	}
	
	public static String revString01(String str) {
		
		if(str.isBlank())
		{
			return str;
		}
		else
		{
		return str.charAt(str.length()-1)+revString01(str.substring(0,str.length()-1));

		}
		
		}
	public static String  revStr(String str)
	{
		if(str.length()==1)
			return str;
		else
		{
			return (str.substring(str.length()-1))+	 revStr(str.substring(0,str.length()-1));
		}
		
	}
}
