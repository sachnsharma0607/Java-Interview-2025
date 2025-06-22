package com.array.minormax;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate_Value_In_Array {
public static void main(String[] args) {
	int[] a = {1, 6, 5, 2, 3, 3, 2};
	List<Integer> list=new ArrayList<>();
	for(int i=0;i<a.length;i++)
	{
		if(list.contains(a[i]))
		{
			System.out.println(a[i]+", ");
		}
		else {
			list.add(a[i]);
		}
	}
	System.out.println("-------");
	duplicate01(a);
}

public static void duplicate01(int[] a)
{

	HashSet<Integer> set=new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
		if(set.contains(a[i]))
		{
			System.out.println(a[i]);
		}
		else
		{
			set.add(a[i]);
		}
		
	}
}

}
