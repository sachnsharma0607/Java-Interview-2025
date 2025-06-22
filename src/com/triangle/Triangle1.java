package com.triangle;

public class Triangle1 {
public static void main(String[] args) {
	triangle04();
}
public static void triangle01()
{
	for(int i=0;i<8;i++)
	{
		for(int j =0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}

public static void triangle02()
{
	for(int i=1;i<8;i++)
	{
		for(int j =1;j<i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}

public static void triangle03()
{
	for(int i=1;i<8;i++)
	{
		for(int j =1;j<8-i;j++)
		{
			System.out.print(" ");
		}
		for(int j =1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}

public static void triangle04()
{
	for(int i=1;i<8;i++)
	{
		for(int j =1;j<8-i;j++)
		{
			System.out.print(" ");
		}
		for(int j =1;j<i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}
}
