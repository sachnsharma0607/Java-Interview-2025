package com.basic;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementInTheListwithoutusingSet {
public static void main(String[] args) {
	List<Object> myList = List.of(12, 11, 40, 12, 5, 6, 5, 12, 11);
	ArrayList<Object> duplist=new ArrayList<>();
	int size=myList.size();
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(myList.get(i).equals(myList.get(j)))
					if(!duplist.contains(myList.get(j)))
						{
					duplist.add(myList.get(j));
					break;
						}
			
			}
		}
	System.out.println("duplist : "+duplist);
}
}
