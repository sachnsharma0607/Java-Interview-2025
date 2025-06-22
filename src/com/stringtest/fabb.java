package com.stringtest;

public class fabb {
public static void main(String[] args) {
	
int a=0;
int b=1;
int c=0;
System.out.print(a+", ");
System.out.print(b+", ");
for(int i =0;i<9;i++)
{
	c=a+b;
	a=b;
	b=c;
	
	System.out.print(c+", ");
}
}

}
