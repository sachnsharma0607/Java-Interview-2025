package com.stringtest;

public class ReverseDigit {
public static void main(String[] args) {
	int n=1256;
	revDigit(n);
}

public static void revDigit(int number)
{ 
	int revnumber=0;
	while(number!=0)
	{
		revnumber=revnumber*10+number%10;;
		number=number/10;
	}
	System.out.println(revnumber);
	
}
}
