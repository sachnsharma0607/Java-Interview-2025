package com.array.minormax;

public class SwapTwoNumber {
public static void main(String[] args) {
	SwapWithoutThirdVariable(25, 5);
}

public static void SwapWithoutThirdVariable(int a, int b)
{
	System.out.println("Before swap");
	System.out.println("a : "+a);
	System.out.println("b : "+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After swap");
	System.out.println("a : "+a);
	System.out.println("b : "+ b);
}
}
